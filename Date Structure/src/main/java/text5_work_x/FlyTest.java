package text5_work_x;

/**
 * @ClassName FlyTest
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/

public class FlyTest {
    Fly fly=new Bird();
  public void fly(){
      fly.fly("大雁",60);
      fly=new Plane();
      System.out.println("%%%%%%");
      fly.fly("波音737",1000);
  }
}
