package text3_work;

/**
 * @ClassName Cylinder
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/28
 **/

public class Cylinder extends Circle{
    private final int h;
    public Cylinder(int x,int y,int h,int r){
        super(x,y,r);
        this.h=h;


    }
    @Override
    public void print(){
        super.print();
        System.out.println("圆柱体的体积："+super.getArea()*this.h);
    }
}
