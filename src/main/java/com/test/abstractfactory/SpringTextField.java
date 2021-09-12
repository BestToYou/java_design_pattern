package com.test.abstractfactory;

public class SpringTextField implements TextField{
    @Override
    public void display() {
        System.out.println("显示spring文本框");
    }
}
