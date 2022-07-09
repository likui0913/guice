package com.tool.test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.tool.test.module.TestModule;
import com.tool.test.service.TestA;
import com.tool.test.service.TestB;
import com.tool.test.service.TestC;

public class Main {

    public static void main(String[] args) {
        Module m = new TestModule();
        Injector injector = Guice.createInjector(m);
        TestA a = injector.getInstance(TestA.class);
        a.print();
        a.getTest().print();
        a.getTest().getTest().print();

        TestB b = injector.getInstance(TestB.class);
        b.print();
        b.getTest().print();
        b.getTest().getTest().print();

        TestC c = injector.getInstance(TestC.class);
        c.print();
        c.getTest().print();
        c.getTest().getTest().print();

        a.print();
        a.getTest().print();
        a.getTest().getTest().print();
        b.print();
        b.getTest().print();
        b.getTest().getTest().print();
        c.print();
        c.getTest().print();
        c.getTest().getTest().print();

        System.out.println(a.hashCode());

    }
}
