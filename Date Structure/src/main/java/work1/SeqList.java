package work1;

/**
 * @ClassName SeqList
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/15
 **/

public class SeqList<T extends Comparable> {
    protected int n;
    protected Object[] element;
    private static final int MIN_CAPACITY = 16;

    public SeqList(int length) {
        if (length < 16) {
            length = 16;
        }

        this.element = new Object[length];
        this.n = 0;
    }

    public SeqList() {
        this(16);
    }

    public SeqList(T[] values) {
        this(values.length * 2);

        for (int i = 0; i < values.length; ++i) {
            if (values[i] != null) {
                this.element[this.n++] = values[i];
            }
        }

    }

    @Override
    public String toString() {
        String str = this.getClass().getName() + "(";

        for (int i = 0; i < this.n; ++i) {
            if (i == 0) {
                str = str + this.element[i].toString();
            } else {
                str = str + "," + this.element[i].toString();
            }
        }

        return str + ")";
    }

    public boolean isEmpty() {
        return this.n == 0;
    }

    public int size() {
        return this.n;
    }

    public T get(int i) {
        return i >= 0 && i < this.n ? (T) this.element[i] : null;
    }

    public void set(int i, T x) {
        if (x == null) {
            throw new NullPointerException("x==null");
        } else if (i >= 0 && i < this.n) {
            this.element[i] = x;
        } else {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
    }

    public int insert(int i, T x) {
        if (x == null) {
            return -1;
        } else {
            if (i < 0) {
                i = 0;
            }

            if (i > this.n) {
                i = this.n;
            }

            Object[] source = this.element;
            int j;
            if (this.n == this.element.length) {
                this.element = new Object[source.length * 2];

                for (j = 0; j < i; ++j) {
                    this.element[j] = source[j];
                }
            }

            for (j = this.n - 1; j >= i; --j) {
                this.element[j + 1] = source[j];
            }

            this.element[i] = x;
            ++this.n;
            return i;
        }
    }

    public int insert(T x) {
        return this.insert(this.n, x);
    }

    public T remove(int i) {
        if (i >= 0 && i < this.n) {
            T x = (T) this.element[i];

            for (int j = i; j < this.n - 1; ++j) {
                this.element[j] = this.element[j + 1];
            }

            this.element[this.n - 1] = null;
            --this.n;
            return x;
        } else {
            return null;
        }
    }

    public T remove(T x) {
        if (x == null) {
            return null;
        } else {
            for (int i = 0; i < this.n; ++i) {
                if (x.equals(this.element[i])) {
                    return this.remove(i);
                }
            }

            return null;
        }
    }
}


