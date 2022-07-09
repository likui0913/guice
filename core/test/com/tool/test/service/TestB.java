package com.tool.test.service;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class TestB implements Test{

    @Inject
    @Named("c")
    Test c;

    @Override
    public void print() {
        System.out.println("TestB print： B hashCode is:" + this.hashCode() + ",C hashCode is:" + c.hashCode());
    }

    @Override
    public Test getTest(){return c;}

}