package com.tool.test.service;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class TestA implements Test{

    @Inject
    @Named("b")
    Test b;

    @Override
    public void print() {
        System.out.println("TestA print： A hashCode is:" + this.hashCode() + ",B hashCode is:" + b.hashCode());
    }

    @Override
    public Test getTest(){return b;}
}
