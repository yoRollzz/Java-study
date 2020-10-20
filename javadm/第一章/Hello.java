package com.diyizhang;

public class Hello {
    public static void main(String[] args) {
        System.out.println("简单的Java程序");
        Student stu=new Student();
        stu.speak("students");
    }
}
class Student{
    public void speak(String s){
        System.out.println(s);
    }
}
