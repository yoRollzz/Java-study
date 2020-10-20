package com.disizhang;

import com.disanzhang.Disizhangyinru2;
public class Example4_22 {
    public static void main(String[] args) {
        Circle3 circle=new Circle3(10);
        Circular3 circular=new Circular3(circle,20);
        System.out.println("圆锥的面积是："+circular.getVolme());
        Disizhangyinru2 d2=new Disizhangyinru2();
        d2.print();
    }
}
