package com.yangchn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * 方法引用测试
 */
public class MethodQuoteTest {


    public static void main(String[] args) {


        Car c = Car.create(Car::new);
        List<Car> cs = Arrays.asList(c);

        cs.forEach(Car::collide);
        cs.forEach((Car x) -> {
            System.out.println(x.toString());
        });
        //cs.forEach(Car::follow);
        cs.forEach(Car::repair);
        Car c1 = Car.create(() -> {
            return null;
        });

        Supplier<Car> s = Car::new;
    }
}
