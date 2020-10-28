package text3_work_x;

/**
 * @ClassName Point
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/28
 **/

public class Point {
    public  int x,y;
    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public  double leng(Point asd){
        return Math.sqrt((this.x-asd.x)*(this.x-asd.x)+(this.y-asd.y)*(this.y-asd.y));



    }
    protected void print(){
        System.out.println("这是点方法");
    }

    public static void main(String[] args) {
        Point c=new Point(3,8);
        Point d=new Point(7,20);
        System.out.println(d.leng(c));
    }
}

class Cricles extends Point{
    private int l=8;

    public Cricles() {

    }


    public Cricles(int s) {
        this. l= s;
    }

//    public Cricles(int x, int y, int l) {
//        super(x, y);
//        this.l = l;
//    }

//    public  void soutpaly(){
//        super.print();
//        System.out.println("这是子方法");
//    }

    public int getL() {
        return l;
    }


}
