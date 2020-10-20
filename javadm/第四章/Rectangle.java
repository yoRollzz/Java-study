package com.disizhang;

public class Rectangle {
    double x,y,width,height;
    public void setX(double a) {
        this.x = a;
    }
    public double getX(){
        return x;
    }

    public void setY(double b) {
        this.y = b;
    }

    public double getY() {
        return y;
    }

    public void setWidth(double w){
        if (w>0)
            width=w;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double h) {
        if (height>0)
            height=h;
    }

    public double getHeight() {
        return height;
    }
}
