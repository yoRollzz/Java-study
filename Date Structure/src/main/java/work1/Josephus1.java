package work1;

/**
 * @ClassName Josephus1
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/15
 **/

public class Josephus1 {
    public Josephus1(int n, int start, int distance) throws IllegalAccessException {
        if (n >= 0 && start >= 0 && start < n && distance > 0 && distance < n) {
            System.out.println("Josephus(" + n + "," + start + "," + distance + "),");
            SeqList<String> list = new SeqList(n);

            for(int i = 0; i < n; ++i) {
                list.insert(String.valueOf((char)(65 + i)));
            }

            System.out.println(list.toString());

            while(n > 1) {
                start = (start + distance - 1) % n;
                System.out.println("删除" + ((String)list.remove(start)).toString() + ", " + list.toString());
                --n;
            }

            System.out.println("被赦免者是" + ((String)list.get(0)).toString());
        } else {
            throw new IllegalAccessException("n=" + n + ",start=" + start + ",distance=" + distance);
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        new Josephus1(8, 5, 3);
    }
}

