package com.test.abstractfactory;

import javax.xml.parsers.DocumentBuilderFactory;

public class XMLUtil {
    public static Object getBean() throws ClassNotFoundException {
        try {
        Class c = Class.forName("com.test.abstractfactory.SpringSkinFactory");
        Object obj = c.newInstance();
        return obj;

        }
        catch (Exception e){
            e.printStackTrace();
            return  null;
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Object c = XMLUtil.getBean();
        System.out.println(c);
    }
}
