package com.disizhang;

public class AAA {
    private  int money;
    private  int getMoney(){
        return money;
    }

    public static void main(String[] args) {
        AAA exa=new AAA();
        exa.money=300;
        int m=exa.getMoney();
        System.out.println("money="+m);
    }
}

//class AAA{
//    private int money;
//    private int getMoney(){
//        return money;
//    }
//}
//class E{
//    public static void main(String[] args) {
//        AAA exa=new AAA();
//        //不再同一个类中无法给money赋值和调用方法
//        exa.money=3000;
//        int m=exa.money;
//        System.out.println("money="+m);
//    }
//}