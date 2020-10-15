package com.z.java.week6;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/15
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private  String id;
    private  String studentName;
    private  String  gender;
    private List<Book> books;
    private  Phone phone;
}
