package com.tool.test.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import com.tool.test.service.Test;
import com.tool.test.service.TestA;
import com.tool.test.service.TestB;
import com.tool.test.service.TestC;

public class TestModule extends AbstractModule {

    @Override
    public void configure(){
        bind(Test.class).annotatedWith(Names.named("a")).to(TestA.class);
        bind(Test.class).annotatedWith(Names.named("b")).to(TestB.class);
        bind(Test.class).annotatedWith(Names.named("c")).to(TestC.class);
    }

}
