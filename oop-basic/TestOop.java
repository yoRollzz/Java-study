package com.z.java.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName TestOop
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/15
 **/

public class TestOop {
     public static  void main(String[] args)
     {
         Student student=Student.builder()
                 .studentName("zmy")
                 .id("2002922233")
                 .gender("male")
                 .phone(Phone.builder().brand("iPhone12").price(9999).build())
                 .build();
         Book[] books=new Book[]{
                 Book.builder().bookName("Java").build(),
                 Book.builder().bookName("离散数学").build(),
                 Book.builder().bookName("C#").build()
         };
         List<Book> bookList = new ArrayList(Arrays.asList(books));
         student.setBooks(bookList);
         for (Book book : student.getBooks()) {
             System.out.println(book.getBookName());
         }


     }
}
