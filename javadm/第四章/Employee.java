package com.disizhang;

public class Employee {
    public int number;
    public Employee(int number){
        /** Employee是一个构造方法，无类型
            @param number是雇员的号码
        */
        this.number=number;
        /**
         get Number是一个实例方法
         @return 方法返回一个整数，即返回number
         */
    }

    public int getNumber() {
        return number;
    }
}
