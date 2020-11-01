package com.yangchn.stream;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author yangchn
 * @Description
 * @date 2020年11月01日
 * Copyright neusoft (c) 2020 .
 */
public class TestStream {

    public static void main(String[] args) {
        List<String> datas = Arrays.asList("a", "b", "c");
        datas = datas.stream().filter(x->x.equals("a")).collect(Collectors.toList());
        datas.forEach(System.out::println);


        //Random
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);


        //Map
        List<Integer> is = Arrays.asList(1,2,3,4,5);
        is.stream().map(x->x*x ).forEach(System.out::println);

        //Filter
        List<String> ds = Arrays.asList("a"," ","b","","dd",null);
        ds.stream().filter(x-> null!=x&&!x.trim().equals("")).forEach(System.out::println);

        //sort
        Random d1 = new Random();
        d1.ints().limit(10).sorted().forEach(System.out::println);

        //parallel
        List<String> ps = Arrays.asList("add","  ","dec","  ","cfe");
        ps.parallelStream().filter(x->x.isEmpty()).count();

        //Collections

        List<String> omg = Arrays.asList("abc","dd","","bbbb");
        omg.stream().filter(x->x.isEmpty()).collect(Collectors.toList()).forEach(System.out::println);


        String mmm = omg.stream().collect(Collectors.joining(","));
        System.out.println(mmm);


        //统计
        List<Integer> tj = Arrays.asList(1,2,3,4,5,6,7,8,9);
        IntSummaryStatistics ss =  tj.stream().mapToInt(x->x).summaryStatistics();
        System.out.println("平均值："+ss.getAverage());
        System.out.println("最大值："+ss.getMax());
        System.out.println("最小值："+ss.getMin());
        System.out.println("总和："+ss.getSum());
    }
}
