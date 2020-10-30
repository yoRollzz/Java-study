package text5_work_x;

/**
 * @ClassName Fly
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/

public interface Fly {
    String name="飞行器";
    int speed=1000;
    /**
     * 飞行方法
     *
     * @param  name
     * @param  speed
     */
    void fly(String name,int speed);
}
