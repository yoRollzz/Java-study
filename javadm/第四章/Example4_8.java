package com.disizhang;

public class Example4_8 {
    public static void main(String[] args) {
        Ladder.下底=100;
        Ladder ladderOne=new Ladder();
        Ladder ladderTwo=new Ladder();
        ladderOne.设置上底(28);
        ladderTwo.设置上底(66);
        System.out.println("ladderOne的下底："+ladderOne.获取上底());
        System.out.println("ladderOne的下底："+ladderOne.获取下底());
        System.out.println("ladderTwo的下底："+ladderTwo.获取上底());
        System.out.println("ladderTwo的下底："+ladderTwo.获取下底());

    }
}
