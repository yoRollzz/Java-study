package com.disanzhang;

public class Example3_7 {
    public static void main(String[] args) {
        int sum=0,i,j;
        for (i=1;i<=10;i++){
            if(i%2==0)
                continue;
            sum+=i;
        }
        System.out.println("sum="+sum);
        for (j=2;j<=50;j++){
            for (i=2;i<=j;i++){
                if (j%i==0)
                    break;
            }
            if (i>j/2)
                System.out.println(""+j+"是素数");
        }
    }
}
