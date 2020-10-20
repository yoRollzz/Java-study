package work4;

import com.sun.deploy.association.Action;

/**
 * @ClassName Node
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/15
 **/


public class Node<T> {
    public T date;
    public Node<T> next;
    public Action data;

    public Node(T date, Node<T> next) {
        this.date = date;
        this.next = next;
    }

    public Node() {
        this((T) null, (Node)null);
    }

    @Override
    public String toString() {
        return this.date.toString();
    }

    public static void main(String[] args) {
    }
}
