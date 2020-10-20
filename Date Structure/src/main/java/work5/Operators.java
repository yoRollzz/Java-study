package work5;

import java.util.Comparator;

/**
 * @ClassName Operators
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/19
 **/

public class Operators implements Comparator<String> {
    private String[] operator = {"*", "/", "%", "+", "-", "&", "^", "|"};
    private int[] priority = {3, 3, 3, 4, 4, 8, 9, 10};
    private SeqList<String> operlist;

    public Operators() {
        this.operlist = new SeqList<String>(this.operator);
    }

    @Override
    public int compare(String oper1, String oper2) {
        int i = operlist.serach(oper1), j = operlist.serach(oper2);
        return this.priority[i] - this.priority[j];
    }

    public int operate(int x,int y ,String oper) {
        int value = 0;
        switch(oper) {
            case "+": value=x+y;break;
            case "-": value=x-y;break;
            case "*": value=x*y;break;
            case "/": value=x/y;break;
            case "%": value=x%y;break;
            case "&": value=x&y;break;
            case "^": value=x^y;break;
            case "|": value=x|y;break;
            default:
        }
        return value;
    }
}
