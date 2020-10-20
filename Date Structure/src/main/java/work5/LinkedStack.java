package work5;

/**
 * @ClassName LinkedStack
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/19
 **/

public final class LinkedStack<T extends Comparable> implements Stack<T> {

    private SinglyList<T> list;
    public LinkedStack(){
        this.list=new SinglyList<>();
    }
    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public void push(T x) {
        this.list.insert(0,x);
    }

    @Override
    public T peek() {
        return this.list.get(0);
    }

    @Override
    public T pop() {
        return this.list.remove(0);
    }
    public String tosString(){
        return this.list.toString();
    }

    public static void main(String[] args) {
        LinkedStack<String> ls1=new LinkedStack<>();
        ls1.push("a");
        ls1.push("b");
        ls1.push("c");
        ls1.push("d");
        System.out.println("链表结果:"+ls1.tosString());
        System.out.println("堆栈的第一个数据是"+ls1.peek());
        ls1.pop();
        System.out.println("链表结果:"+ls1.tosString());
    }
}

