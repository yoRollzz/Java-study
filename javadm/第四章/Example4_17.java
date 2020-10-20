package com.disizhang;

public class Example4_17 {
    public static void main(String[] args) {
        Student1 zhang=new Student1();
        Student1 geng=new Student1();
        zhang.setAge(23);
        System.out.println("zhang的年龄:"+zhang.getAge());
        geng.setAge(25);
        System.out.println("geng的年龄："+geng.getAge());
        //已经无法通过.属性的方式给age赋值，因为属性被私有化只能通过get、set方法赋值或者获取
    }
}
