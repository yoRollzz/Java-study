package text2_work_x;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * @ClassName FormatUil
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/22
 **/

public class FormatUil {
    public static String format(LocalDate date) {
       return  String.valueOf( date.getYear()+date.getMonthValue()+date.getDayOfMonth());

    }
    public  static  void main(String[] args){
        System.out.println(LocalDate.now());
        System.out.println(new Date());
    }
}

