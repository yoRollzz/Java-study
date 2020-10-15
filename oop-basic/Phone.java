package com.z.java.week6;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Phone
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/15
 **/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    private String brand;
    private Integer price;
}
