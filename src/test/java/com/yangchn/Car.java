package com.yangchn;

import java.util.function.Supplier;

/**
 * @author yangchn
 * @Description
 * @date 2020年10月30日
 * Copyright neusoft (c) 2020 .
 */
public class Car {

    public static Car create(final Supplier<Car> s) {
        return s.get();
    }


    public static void collide(final Car car) {
        System.out.println("collide" + car.toString());
    }

    public void follow(final Car c) {
        System.out.println("follow" + c.toString());
    }

    public void repair() {
        System.out.println("Repair" + this.toString());
    }
}
