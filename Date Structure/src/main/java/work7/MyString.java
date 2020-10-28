package work7;

/**
 * @ClassName MyString
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/26
 **/

public final class MyString implements Comparable<MyString> {
    private final char[] value;

    public MyString() {
        this.value = new char[0];
    }

    public MyString(String s) {
        this.value = new char[s.length()];
        for (int i = 0; i < this.value.length; i++) {
            this.value[i] = s.charAt(i);
        }
    }

    public MyString(char[] value, int i, int n) {
        if (i > 0 && n >= 0 && i + n <= value.length) {
            this.value = new char[n];
            for (int j = 0; j < n; j++) {
                this.value[j] = value[i + j];
            }
        } else {
            throw new StringIndexOutOfBoundsException("i=" + i + ",n=" + n + ",i+n" + (i + n));
        }
    }

    public MyString(char[] value) {
        this(value, 0, value.length);
    }

    public MyString(MyString s) {
        this(s.value);
    }

    @Override
    public String toString() {
        return new String(this.value);
    }

    public char charAt(int i) {
        if (i >= 0 && i < this.value.length) {
            return this.value[i];
        }
        throw new StringIndexOutOfBoundsException(i);
    }


    @Override
    public int compareTo(MyString o) {
        return 0;
    }

    public int indexOf(MyString pattern) {
        return this.indexOf(pattern, 0);

    }

    public int indexOf(MyString pattern, int begin) {
        int n = this.value.length, m = pattern.value.length;
        if (begin < 0) {
            begin = 0;
        }
        if (n == 0 || n < m || begin >= n) {
            return -1;
        }
        int i = begin, j = 0;
        while (i < n && j < m) {
            if (this.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
                if (i > n - m) {
                    break;
                }
            }
        }
        return j == m ? i - m : -1;
    }

//    public static int indexOf(String target,String pattern){
//        return indexOf(target,pattern,0);
//    }

//    public static int indexOf(String target,String pattern,int begin){
//        int n = target.length(),m=pattern.length();
//        if(begin<0){
//            begin=0;
//            if(n==0||n<m||begin>=n){
//                return -1;
//            }
//            next=getNext
//        }
//    }

    public static void main(String[] args) {
        MyString target = new MyString("abcdgggdfgabcdg"), pattern = new MyString("abcdg");
        System.out.println("\"" + target + "\".indexOf(\"" + pattern + "\")=" + (target.indexOf(pattern) + 1));
    }
}

