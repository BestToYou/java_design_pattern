package com.test.abstractfactory;

public class client {
    public static void main(String[] args) throws ClassNotFoundException {
        SkinFactory factory;
        Button bt;
        TextField tf;
        factory = (SkinFactory)XMLUtil.getBean();
        bt= factory.createButton();
        bt.display();

    }
}
