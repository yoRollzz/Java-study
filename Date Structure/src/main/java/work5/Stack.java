package work5;

/**
 * @ClassName Stack
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/19
 **/
public interface Stack<T> {
    public abstract boolean isEmpty();
    public abstract void push(T x);
    public abstract T peek();
    public abstract T pop();
}
