package com.disizhang;

public class Student {
    int number;
    Student(int n){
        this.number=n;
    }
    void speak(){
        System.out.println("Student类的包名是com.disizhang,我的学号："+number);
    }
}
