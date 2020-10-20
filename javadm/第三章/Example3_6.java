package com.disanzhang;

public class Example3_6 {
    public static void main(String[] args) {
        double sum=0,item=1;
        int i=1,n=20;
        while(i<=n){
            sum+=item;
            i++;
            item=item*(1.0/i);
        }
        System.out.println("sum="+sum);
    }
}
