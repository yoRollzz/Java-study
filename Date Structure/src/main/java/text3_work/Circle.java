package text3_work;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/28
 **/

public class Circle extends Point {
    private int r;
    public  Circle(){
        System.out.println("圆被初始化了");
    }
    public Circle(int x,int y,int r){
        super(x,y);
        this.r=r;
        System.out.println("带参数被圆初始化了");
    }
    @Override
    public void print() {
        System.out.println("圆的面积:" + Math.PI * r * r);
    }
    public double getArea(){
        return Math.PI*r*r;
    }
    }
