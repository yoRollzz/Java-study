package com.disizhang;

public class Computer {
    public double getResult(double a,int...x){
        double result=0;
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum+=x[i];
        }
        result=a*sum;
        return result;
    }
}
