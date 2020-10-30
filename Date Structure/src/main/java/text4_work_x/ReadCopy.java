package text4_work_x;

import java.io.*;
import java.util.UUID;

/**
 * @ClassName ReadCopy
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/

public class ReadCopy {
    public static void main(String[] args) {
        String s;
        try{
            //使用Writer类可以直接输出字符串
            //FileWriter out = new FileWriter("C:\\Users\\yoRoll.z\\Desktop\\1.txt");
            Reader reader=new FileReader("C:\\Users\\yoRoll.z\\Desktop\\1.txt");
            char[] cs=new char[1024];
            int len=reader.read(cs);
            s=new String(cs,0,len);
            reader.close();
            Writer out = new FileWriter("C:\\Users\\yoRoll.z\\Desktop\\2.txt",true);
            out.write(s);
            out.flush();
            out.close();


        }catch(IOException e) {
            e.printStackTrace();
        }



    }
}