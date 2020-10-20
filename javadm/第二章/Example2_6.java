package com.dierzhang;

import java.util.Arrays;

public class Example2_6 {
    public static void main(String[] args) {
        int [] a={10,20,30,40,50,60},b,c,d;
        b= Arrays.copyOf(a,10);
//        System.out.println(Arrays.toString(b));
        System.out.println("数组a的各个元素中的值");
        System.out.println(Arrays.toString(a));
        System.out.println("数组b的各个元素中的值");
        System.out.println(Arrays.toString(b));

        c=Arrays.copyOfRange(a,3,5);
        System.out.println("数组c的各个元素中的值");
        System.out.println(Arrays.toString(c));
        d=Arrays.copyOfRange(a,3,9);
        System.out.println("数组d的各个元素中的值");
        System.out.println(Arrays.toString(d));
    }

}
