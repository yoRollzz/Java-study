package com.disanzhang;

enum Color{
    红,蓝,绿,黄,黑
}
public class Example3_9 {
    public static void main(String[] args) {
        for (Color a:Color.values()){
            for (Color b:Color.values()){
                for (Color c:Color.values()){
                    if (a!=b&&a!=c&&b!=c)
                        System.out.println(a+","+b+","+c+"|");
                }
            }
        }
    }
}
