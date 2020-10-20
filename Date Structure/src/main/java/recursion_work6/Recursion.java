package recursion_work6;



/**
 * @ClassName Recursion
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/20
 **/

public class Recursion {
    public static void line(int i,int n) {
        System.out.printf("%3d%n", i);
        if (i < n) {
            line(i + 1, n);
            System.out.printf("%3d%n", i);
        }
    }
    public static void main(String[] args) {
        int n = 9;

        for (int i=1;i<=n;i++)
            System.out.printf("%" + 3 * (n - 1 + 1) + "c%n", "");
            line(1, i);
            System.out.println();
            i++;

    }
        }






