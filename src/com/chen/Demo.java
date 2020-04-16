package com.chen;


import org.junit.Test;

import java.sql.Array;
import java.sql.Connection;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
      /*  System.out.println(Math.round(-1.5));
        System.out.println(Math.ceil(-1.5));
        System.out.println(Math.floor(-1.5));
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty(" "));
        System.out.println(StringUtils.isBlank(" "));
        String str = new String("Hello World");
        System.out.println(str.substring(1,3));*/
        int[] arr1 = new int[3];
        int[] arr2 = new int[]{1,2,3};
        int[] arr3 ={1,2,3};
        for (int item: arr2) {
            System.out.println(item);
        }

        doprint doprint1 = msg ->
                System.out.println(msg);
        doprint1.say("hello world");


    }
    interface doprint{
        void say(String msg);
    }
    Runnable r1 =() ->  System.out.println("HELLO");

    @Test
    public void test(){
        r1.run();
    }

    @Test
    public void test2(){
        Comparator<Integer> com = (x,y) -> Integer.compare(x,y);
        int compare = com.compare(2, 3);
        System.out.println(compare);

    }


    @Test
    public void test3(){
        Comparator com = new Comparator() {
            public int compare1(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }


            @Override
            public int compare(Object o1, Object o2) {
                return -1;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };


    }


    public  String gettoUpperCase(String str,MyFun mf){
        return mf.getValue(str);
    }

    @Test
    public void getUp (){
        String str1 = gettoUpperCase("helloworld",(x) -> x.toUpperCase());
        StringBuilder stb = new StringBuilder();
        stb.append(str1.charAt(1)).append(str1.charAt(3));
        System.out.println(str1);
        System.out.println(stb);
    }


    @Test
    public void test4(){
        List<String> strlist = Arrays.asList("jacklove", "uzi", "clearlove", "knight", "xiaohu");
        List <String> judge = judge(strlist, (x) -> x.length() > 4);
        for (String s : judge) {
            System.out.println(s);
        }
    }

    public List<String> judge(List<String> list,Predicate <String>pr){
        List<String> arrayList = new ArrayList<>();
        for (String item :list ) {
            if(pr.test(item)){
                arrayList.add(item);
            }
        }
        return arrayList;
    }

    @Test
    public void test5(){
      //  Consumer<Integer> con = (x) -> System.out.println(x*x);
        Consumer<Integer> con = System.out::println;
        con.accept(10);
    }
}
