package text2_work_x;

import java.util.SimpleTimeZone;

/**
 * @ClassName OverLoadTest
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/22
 **/

public class OverLoadTest {
    public static String sum(int a,int b){
        int sum =a+b;
        int min=sum/60;
        int s=sum-min*60;
        return min+":"+s;

    }

public  static  void main(String[] args){
    System.out.println(sum(35,68));
}
}
