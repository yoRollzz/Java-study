package work5;



/**
 * @ClassName Node
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/15
 **/


public class Node<T> {
    public T data;
    public Node<T> next;


    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node() {
        this(null, (Node)null);
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

    public static void main(String[] args) {
    }
}
