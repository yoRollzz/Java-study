package com.disizhang;

public class Ladder {
    double 上底,高;
    static double 下底;
    void 设置上底(double a){
        上底=a;
    }
    void 设置下底(double b){
        上底=b;
    }
    double 获取上底(){
        return 上底;
    }
    double 获取下底(){
        return 下底;
    }
}
