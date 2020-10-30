package work5;

/**
 * @ClassName SeqStack
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/19
 **/

public final class SeqStack<T> implements Stack<T> {
    private SeqList list;
    public SeqStack(int length){
        this.list=new SeqList(length);
    }
    public SeqStack(){
        this(64);
    }
    @Override
    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    @Override
    public void push(T x){
        this.list.insert((Comparable) x);
    }
    @Override
    public T peek(){
        return (T)this.list.get(list.size()-1);
    }
    @Override
    public T pop(){
        return (T)list.remove(list.size()-1);
    }

    public String tosString(){
        return this.list.tosString();
    };

    public static void main(String[] args) {
        SeqStack<String> ss1=new SeqStack<>(24);
        ss1.push("A");
        ss1.push("B");
        ss1.push("C");
        System.out.println("111");
        System.out.println("栈表的数据"+ss1.tosString());
    }
}
