package com.z.java.week6;

import lombok.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Book
 * @Description TODO图书实体类
 * @Author yoRoll.z
 * @Date 2020/10/15
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    private String bookName;
    private Integer price;
    private Date publishDate;


    @Override
    public String toString(){
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = df.format(this.publishDate);
        String s1="book{name:%s,price:%s,date:%s";
        String s2 = String.format(s1,this.bookName,now);
        return s2;
    }
}
