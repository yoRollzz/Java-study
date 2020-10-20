package com.disizhang;

public class Circular {
    Circle bottom;
    double height;
    Circular (Circle c,double h){
        bottom=c;
        height=h;
    }
    double getVolme(){
        return  bottom.getArea()*height/3.0;
    }
    double getBottomRadius(){
        return bottom.getRadius();
    }
    public void setBottomRadius(double r){
        bottom.setRadius(r);
    }
}
