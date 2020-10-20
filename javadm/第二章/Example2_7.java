package com.dierzhang;

import java.util.Arrays;

public class Example2_7 {
    public static void main(String[] args) {
        int [] a={12,34,9,23,45,6,45,90,123,19,34},b;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int number=10;
        int index=Arrays.binarySearch(a,number);
        if (index>=0){
            System.out.println(number+"和数组中索引为"+index+"的元素值相同");
        }else{
            //找到返回大于0的值找不到返回小于0的值
            System.out.println("index的值为"+index);
            System.out.println(number+"不与数组中的任何元素值相同");
        }
    }
}
