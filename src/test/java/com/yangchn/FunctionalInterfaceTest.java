package com.yangchn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created on 2020/10/31 17:52
 * <p>Title: 函数式接口：有且只有一个抽象函数的接口
 * <p>Description: []</p>
 *
 * @version 1.0
 */
public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        List<Integer> datas = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);


        FunctionalInterfaceTest.eval(datas, (x) -> {
            return x % 2 == 0;
        });
System.out.println("-----------------");
        FunctionalInterfaceTest.eval(datas,x->x>7);

    }


    public static void eval(List<Integer> list, Predicate<Integer> predicate) {

        for (Integer i : list) {
            if (predicate.test(i)) {
                System.out.println(i + " ");
            }

        }

    }
}
