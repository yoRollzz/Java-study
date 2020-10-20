package com.disizhang;

public class Circular3 {
    Circle3 bottom;
    double height;

    public Circular3(Circle3 c, double h) {
        this.bottom = c;
        this.height = h;
    }

    public double getVolme() {
        return bottom.getArea() * height / 3.0;
    }
}
