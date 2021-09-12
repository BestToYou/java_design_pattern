package com.test.abstractfactory;

public class SummerSkinFactory implements  SkinFactory{
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }
}
