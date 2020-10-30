package text4_work_x;

import java.io.*;
import java.util.Arrays;
import java.util.UUID;

/**
 * @ClassName FileCopy
 * @Description TODO:使用IO流实现文件的复制
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/

public class FileCopy {
    public  static  void main(String[] args)throws IOException {

        //将源文件读入内存数组


        File file1 =new File("C:\\Users\\yoRoll.z\\Desktop\\11.jpg");
        InputStream is=new FileInputStream(file1);
        byte[] b=new byte[(int) file1.length()];
        int readResult=is.read(b);
        System.out.println(Arrays.toString(b));
        System.out.println(readResult);


        //将内存数组中的值写道目标文件
        File file2=new File("C:\\Users\\yoRoll.z\\"+ UUID.randomUUID().toString()+".jpg");
        OutputStream os=new FileOutputStream(file2);
        os.write(b);
        os.close();
    }
}
