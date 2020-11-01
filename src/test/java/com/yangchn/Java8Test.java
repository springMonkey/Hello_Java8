package com.yangchn;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author yangchn
 * @Description
 * @date 2020年10月29日
 */
public class Java8Test {


    private static List<String> nameList = new ArrayList<>();

    static {
        nameList.add("beta");
        nameList.add("gamma");
        nameList.add("alpha");
        nameList.add("omiga");
        nameList.add("lambda");
    }

    public static void main(String[] args) {
        System.out.print(StringUtils.join(nameList, ","));
        Java8Test lt = new Java8Test();
        System.out.println("");
        lt.sortJava8();
        System.out.print(StringUtils.join(nameList, ","));
    }

    public void sortJava7() {
        Collections.sort(nameList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public void sortJava8() {
        Collections.sort(nameList, (s1, s2) -> s1.compareTo(s2));
    }
}
