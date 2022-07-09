package com.tool.test.service;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class TestC implements Test{

    @Inject
    @Named("a")
    Test a;

    @Override
    public void print() {
        System.out.println("TestC print： C hashCode is:" + this.hashCode() + ",A hashCode is:" + a.hashCode());

    }

    @Override
    public Test getTest(){return a;}

}