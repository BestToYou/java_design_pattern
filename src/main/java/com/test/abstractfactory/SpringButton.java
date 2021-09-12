package com.test.abstractfactory;

public class SpringButton implements Button{
    @Override
    public void display() {
        System.out.println("显示spring按钮");
    }
}
