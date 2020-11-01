package com.yangchn.defaultmethod;

/**
 * @author yangchn
 * @Description
 * @date 2020年11月01日
 * Copyright neusoft (c) 2020 .
 */
public class DefaultTests implements MobilePhone {
    @Override
    public String getBrand() {
        return "iphone";
    }

    @Override
    public String getColor() {
        return "red";
    }

    @Override
    public Double getLength() {
        return 150.00;
    }

}