package com.yangchn;

/**
 * @author yangchn
 * @Description
 * @date 2020年10月29日
 * Copyright neusoft (c) 2020 .
 */
public class LambdaTest {



    final static String sign = "Yangchn";
    public static void main(String[] args) {


        String kkkk = "00000";
        LambdaTest test = new LambdaTest();

        MathOperation add = (x, y) -> x + y;
        MathOperation zero = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
            return 0;
        };

        System.out.println("1 + 2 = " + test.operate(1, 2, add));
        System.out.println("1 + 2 = " + test.operate(1, 2, zero));


        GreetingService gs = (String param)->{
            //访问局域遍历
            param = param + kkkk;
            System.out.println(param);
        };

        gs.sayMessage("啦啦啦啦");

    }


    interface MathOperation {
        int operate(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String param);
    }


    private int operate(int a, int b, MathOperation mo) {
        return mo.operate(a, b);
    }
}
