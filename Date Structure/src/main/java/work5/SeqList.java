package work5;

import lombok.val;

import java.util.Comparator;

/**
 * @ClassName SeqList
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/19
 **/

public class SeqList<T extends Comparable> {

    public int n;
    public Object[] element;
    public static final int MIN_CAPACITY = 16;

    // 构造方法1传入整形设置数组长度
    public SeqList(int lengh) {
        if (lengh < MIN_CAPACITY) {
            lengh = MIN_CAPACITY;
        }
        this.element = new Object[lengh];
        this.n = 0;
    }

    // 无参构造方法
    public SeqList() {
        this(MIN_CAPACITY);
    }

    // 构造方法2传入T类型的数组
    public SeqList(T[] values) {
        this(values.length * 2);
        for (int i = 0; i < values.length; i++) {
            if (values[i] != null) {
                this.element[this.n++] = values[i];
            }
        }
    }

    // 判断数组是否为空
    public boolean isEmpty() {
        return this.n == 0;
    }

    // 返回元素个数
    public int size() {
        return this.n;
    }

    // 返回第i个元素
    public T get(int i) {
        if (i >= 0 && i < this.n) {
            return (T) this.element[i];
        }
        return null;
    }

    // 设置第i个元素为x
    public void set(int i, T x) {
        if (x == null) {
            throw new NullPointerException("x=null");
        }
        if (i >= 0 && i < this.n) {
            this.element[i] = x;
        } else {
            throw new java.lang.IndexOutOfBoundsException(i + "");
        }
    }

    // 在第i个位置插入x
    public int insert(int i, T x) {
        if (x == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        if (i > this.n) {
            i = this.n;
        }
        Object[] source = this.element;
        if (this.n == source.length) {
            this.element = new Object[source.length * 2];
            for (int j = 0; j < i; j++) {
                this.element[j]=source[i];
            }
        }
        for (int j = this.n-1; j >=i; j--) {
            this.element[j+1]=source[j];
        }
        this.element[i]=x;
        this.n++;
        return i;
    }
    //在数组后面添加x
    public int insert(T x) {
        return this.insert(this.n,x);
    }



    //删除第i个元素
    public T remove(int i) {
        if(i>=0&&i<this.n) {
            T x=(T) this.element[i];
            for (int j = i; j < this.n-1; j++) {
                this.element[j]=this.element[j+1];
            }
            this.element[this.n-1]=null;
            this.n--;
            return x;
        }
        return null;
    }

    //查找对应关键字的下标
    public int serach(T key) {
        for (int i = 0; i <this.n; i++) {
            if (key.equals(this.element[i])) {
                return i;
            }
        }
        return -1;
    }

    //根据值查找删除数据
    public T remove(T key) {
        return this.remove(this.serach(key));
    }

    // 重写tostring的方法,将数组打印出来
    public String tosString() {
        String str = this.getClass().getName() + "(";
        if (this.n > 0) {
            str += this.element[0].toString();
        }
        for (int i = 1; i < this.n; i++) {
            str += "," + this.element[i].toString();
        }
        return str + ")";
    }

    public int binarySearch(T key) {
        int low = 0;
        int high = this.element.length - 1;
        while (low < high) {
            int mid = (low + high / 2);
            if (key == this.element[mid]) {
                System.out.println("此关键字在seqList中的位置为:" + mid);
                break;
            }
            if (key.compareTo(this.element[mid]) > 0) {
                low = mid + 1;
            }
            if (key.compareTo(this.element[mid]) < 0) {
                high = mid - 1;
            }
        }
        return -1;
    }
    public Integer erfenSearch(int key) {
        int start = 0;
        int end = this.element.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (key < (int)this.element[middle]) {
                end = middle - 1;
            } else if (key > (int)this.element[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] value = { "a", "b", "c", "d" };
        SeqList<String> seq1 = new SeqList<String>(value);
        System.out.println("原数组"+seq1.tosString());
        seq1.insert("qwq");
        System.out.println("插入之后"+seq1.tosString());
        seq1.remove(1);
        System.out.println("删除之后"+seq1.tosString());
        seq1.remove("qwq");
        System.out.println("删除值之后"+seq1.tosString());
        seq1.binarySearch("A");
        Integer[] value1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SeqList<Integer> seq2 = new SeqList<Integer>(value1);
        System.out.println(seq2.erfenSearch(7));

    }
}
