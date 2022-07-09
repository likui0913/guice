/*
 * Copyright (C) 2006 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.inject;

/**
 * 我们正在运行的阶段。
 * The stage we're running in.
 *
 * @author crazybob@google.com (Bob Lee)
 */
public enum Stage {

  /**
   * 我们在一个工具中运行（例如一个 IDE 插件）
   * We're running in a tool (an IDE plugin for example). We need binding meta data but not a
   * functioning Injector. Do not inject members of instances. Do not load eager singletons. Do as
   * little as possible so our tools run nice and snappy. Injectors created in this stage cannot be
   * used to satisfy injections.
   */
  TOOL,

  /**
   * 我们想要以牺牲运行时性能和一些预先错误检查为代价的快速启动时间。
   * We want fast startup times at the expense of runtime performance and some up front error checking.
   */
  DEVELOPMENT,

  /**
   * 我们希望尽早发现错误并提前处理性能问题。
   * We want to catch errors as early as possible and take performance hits up front.
   */
  PRODUCTION
}
