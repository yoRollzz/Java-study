package work4;

/**
 * @ClassName SingIgList
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/15
 **/

class SinglyList<T extends Comparable>  {
    public Node<T> head;

    public SinglyList() {
        this.head = new Node();
    }

    public SinglyList(T[] values) {
        this();
        Node<T> rear = this.head;

        for (int i = 0; i < values.length; ++i) {
            if (values[i] != null) {
                rear.next = new Node(values[i], (Node) null);
                rear = rear.next;
            }
        }

    }

    public boolean isEmpty() {
        return this.head.next == null;
    }

    public T get(int i) {
        Node<T> p = this.head.next;

        for (int j = 0; p != null && j < i; ++j) {
            p = p.next;
        }

        return i >= 0 && p != null ? p.date : null;
    }

    public int size() {
        Node<T> p = this.head.next;

        int count;
        for (count = 0; p != null; p = p.next) {
            count++;
        }

        return count;
    }

    public void set(int i, T x) {
        Node<T> p = this.head.next;

        for (int count = 0; p != null; p = p.next) {
            if (count == i) {
                p.date = x;
                return;
            }

            ++count;
        }

    }

    /*public String toString() {
        String str = this.getClass().getName() + "(";

        for (Node p = this.head.next; p != null; p = p.next) {
            str = str + p.data.toString() + (p.next != null ? "," : "");
        }

        return str + ")";
    }*/

    public Node<T> insert(int i, T x) {
        if (x == null) {
            return null;
        } else {
            Node<T> front = this.head;

            for (int j = 0; front.next != null && j < i; ++j) {
                front = front.next;
            }

            front.next = new Node(x, front.next);
            return front.next;
        }
    }

    public Node<T> insert(T x) {
        return this.insert(2147483647, x);
    }

    public void remove(T key) {
        Node<T> p = this.head.next;
        Node y = null;

        while (p != null) {
            y = p;
            p = p.next;
            if (p.data.equals(key)) {
                //if (p.data == key) ==比较地址，equals比较数据，默认相等
                y.next = p.next;
            }
        }

    }

    public void print() {
        for (Node head = this.head; head.next != null; head = head.next) {
            System.out.print(head.next.toString());
        }
        System.out.println();
    }

//    public static void Reverse(SinglyList<Integer> L) {
//        Node<Integer> p = L.head.next, q;
//        L.head.next = null;
//        while (p != null) {
//            q = p.next;
//            p.next = L.head.next;
//            L.head.next = p;
//            p = q;
//        }
//    }

    public void reverse() {
        Node<T> p = this.head.next, succ = null, front = null;
        while (p != null) {
            succ = p.next;
            p.next = front;
            front = p;
            p = succ;
        }
        this.head.next = front;
    }

    public void Reverse1() {
        Node<T> p = this.head.next, q;
        this.head.next = null;
        while (p != null) {
            q = p.next;
            p.next = this.head.next;
            this.head.next = p;
            p = q;
        }
    }


    public Node<T> merge(SinglyList list2) {
        Node<T> p, q, t, s;
        p = this.head.next;
        t = this.head;
        q = list2.head.next;
        s = q.next;
        if (p == null) {
            return (list2.head);
        }
        if (q == null) {
            return (this.head);
        }
        while (p != null && q != null) {
            if (p.date.equals(q.date)) {
                p=p.next;
                q=q.next;
                t=t.next;
                if(s==null){
                    break;}
                else{
                    s=s.next;}

            }else if(p.date.compareTo(q.date)>0)
            {
                q.next=t.next;
                t.next=q;
                t=t.next;
                q=s;
                s=s.next;
            }else if(p.date.compareTo(q.date)<0)
            {
                p=p.next;
                t=t.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        String[] values = new String[]{"A", "B", "C", "D", "E", "F"};
        SinglyList<String> list = new SinglyList(values);
        list.insert(2, "H");
        System.out.println("插入元素：" + list.insert("H"));
        System.out.println("遍历链表：");
        list.print();
        System.out.println("链表长度：" + list.size());
        list.set(4, "A");
        System.out.println("设第4个元素为A");
        System.out.println("遍历链表：");
        list.print();
        //55System.out.println("删除元素：" + list.remove("F"));
        System.out.println("遍历链表：");
        list.print();
        list.reverse();
        System.out.println(list.toString());
        String [] values1= {"a","b","4","6","8"};
        String [] value2={"2","3","b","7","a"};
        SinglyList<String> list3 = new SinglyList<>(values1);
        SinglyList<String> list4 = new SinglyList<>(value2);
        list3.merge(list4);
        list3.print();
    }
    }
