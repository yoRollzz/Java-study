package com.disizhang;

public class Example4_6 {
    public static void main(String[] args) {
        Computer computer=new Computer();
        double result=computer.getResult(1.0/4,10,20,30,40);
        System.out.println("10,20,30,40的平均数："+result);
        result=computer.getResult(1.0/6,66,12,5,89,2,51);
        System.out.println("66,12,5,89,2,51的平均数："+result);
    }
}
