package work5;

/**
 * @ClassName SinglyList
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/19
 **/
public class SinglyList<T extends Comparable> extends Object {

    public Node<T> head;

    public SinglyList() {
        this.head = new Node<T>();
    }

    public SinglyList(T[] values) {
        this();
        Node<T> rear = this.head;
        for (int i = 0; i < values.length; i++) {
            if (values[i] != null) {
                rear.next = new Node<T>(values[i], null);
                rear = rear.next;
            }
        }
    }

    public boolean isEmpty() {
        return this.head.next == null;
    }

    public T get(int i){
        Node<T> p=this.head.next;
        for (int j=0;p!=null&&j<i;j++){
            p=p.next;
        }
        return (i>=0&&p!=null)?p.data:null;
    }

    public void set(int i, T x) {
        int n = 0;
        if (x == null) {
            System.out.println("x的值不能为空");
        }
        if (i < 0) {
            System.out.println("i的值不能小于0");
        }
        Node<T> p = new Node<>();
        p = this.head.next;
        while (p != null) {
            if (n == i) {
                p.data = x;
            }
            p = p.next;
            n++;
        }

    }

    public int size() {
        int result = 1;
        Node<T> p = new Node<>();
        p = this.head.next;
        while (p.next != null) {
            p = p.next;
            result++;
        }
        return result;
    }

    public Node<T> search(T key) {
        Node<T> p = new Node<>();
        p = this.head.next;
        while (p != null) {
            if (key.equals(p.data)) {
                return p;
            }
            p = p.next;
        }
        return null;
    }

    public Node<T> insert(int i, T x) {
        if (x == null) {
            return null;
        }
        Node<T> front = this.head;
        for (int j = 0; front.next != null && j < i; j++) {
            front = front.next;
        }
        front.next = new Node<T>(x, front.next);
        return front.next;
    }

    public Node<T> insert(T x) {
        return insert(Integer.MAX_VALUE, x);
    }

    public T remove(int i) {
        Node<T> front = this.head;
        for (int j = 0; front.next != null && j < i; j++) {
            front = front.next;
        }
        if (i >= 0 && front.next != null) {
            T x = front.next.data;
            front.next = front.next.next;
            return x;
        }
        return null;
    }

    public void clear() {
        this.head.next = null;
    }


    public T remove(T key) {
        Node<T> p = this.head;
        while (p.next != null) {
            Node<T> leftData = p;
            p = p.next;
            if (p.data.equals(key)) {
                leftData.next = p.next;
                return key;
            }
        }
        return null;

    }

    @Override
    public String toString() {
        String str = this.getClass().getName() + "(";
        for (Node<T> p = this.head.next; p != null; p = p.next) {
            str += p.data.toString() + (p.next != null ? "," : "");
        }
        return str + ")";
    }

    //两个变量颠倒链表
    public void Reverse() {
        Node<T> p = this.head.next, q;
        this.head.next = null;
        while (p != null) {
            q = p.next;
            p.next = this.head.next;
            this.head.next = p;
            p = q;
        }
    }

    //三个变量颠倒链表
    public void reverse() {
        Node<T> p = this.head.next;
        Node<T> succ = null, front = null;
        while (p != null) {
            succ = p.next;
            p.next = front;
            front = p;
            p = succ;
        }
        this.head.next = front;
    }

    public Node<T> merge1(SinglyList list) {
        Node<T> p, q, t, s;
        p = this.head.next;
        t = this.head;
        q = list.head.next;
        s = q.next;
        if (p == null) {
            return (list.head);
        }
        if (q == null) {
            return (this.head);
        }
        while (p != null && q != null) {
            if (p.data.equals(q.data)) {
                p = p.next;
                q = q.next;
                t = t.next;
                if (s == null) {
                    break;
                } else {
                    s = s.next;
                }
            } else if (p.data.compareTo(q.data) > 0) {
                q.next = t.next;
                t.next = q;
                t = t.next;
                q = s;
                if (s == null) {
                    break;
                }
                s = s.next;
            } else if (p.data.compareTo(q.data) < 0) {
                if (p.next==null){
                    p.next=q;
                    q=s;
                }else {
                    p = p.next;
                    t = t.next;
                }

            }
        }
        return p;
    }
    public Node<T> merge2(SinglyList list) {
        Node<T> p, q, t, s;
        p = this.head.next;
        t = this.head;
        q = list.head.next;
        s = q.next;
        if (p == null) {
            return (list.head);
        }
        if (q == null) {
            return (this.head);
        }
        while (p != null && q != null) {
            if (p.data.equals(q.data)) {
                q.next=p.next;
                p.next=q;
                p=p.next;
                t=t.next;
                q=s;
//                q.next=p.next;
//                t.next=q;
//                t=t.next;
//                s=q;
//                s=s.next;
                if (s == null) {
                    break;
                } else {
                    s = s.next;
                }
            } else if (p.data.compareTo(q.data) > 0) {
                q.next = t.next;
                t.next = q;
                t = t.next;
                q = s;
                if (s == null) {
                    break;
                }
                s = s.next;
            } else if (p.data.compareTo(q.data) < 0) {
                if (p.next==null){
                    p.next=q;
                    q=s;
                }else {
                    p = p.next;
                    t = t.next;
                }


            }
        }
        return p;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] values = {"a", "b", "c", "d"};
        SinglyList<String> sl1 = new SinglyList<String>(values);
        System.out.println("链表的元素个数为" + sl1.size());
        System.out.println(sl1.toString());
        System.out.println("-------");
        sl1.set(2, "x");
        System.out.println("链表set之后的值" + sl1.toString());
        System.out.println("-------");
        System.out.println("查询的结果" + sl1.search("d"));
        System.out.println("-------");
        sl1.insert(1, "2");
        System.out.println("插入之后的数据" + sl1.toString());
        System.out.println("-------");
        System.out.println(sl1.remove("x"));
        System.out.println("删除之后的数据" + sl1.toString());
        sl1.remove(1);
        System.out.println("删除之后的数据" + sl1.toString());
        System.out.println("-------");
        sl1.Reverse();
        System.out.println("两个变量Reverse之后的数据" + sl1.toString());
        sl1.reverse();
        System.out.println("三个变量resverse之后的数据" + sl1.toString());

        System.out.println("----------------------");
        Integer[] i1 = {1, 3, 5, 7, 12,15};
        Integer[] i2 = {3, 5, 10,14};
        SinglyList<Integer> integeri1 = new SinglyList<>(i1);
        SinglyList<Integer> integeri2 = new SinglyList<>(i2);
        integeri1.merge1(integeri2);
        System.out.println("1并2（不重复）之后的结果：");
        System.out.println(integeri1);
        System.out.println("----------");
        Integer[] im1 = {1, 3, 5, 7, 12,15};
        Integer[] im2 = {3, 5, 10,12,16};
        SinglyList<Integer> integerim1 = new SinglyList<>(im1);
        SinglyList<Integer> integerim2 = new SinglyList<>(im2);
        integerim1.merge2(integerim2);
        System.out.println("1并2（重复）之后的结果");
        System.out.println(integerim1);

    }

}

