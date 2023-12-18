package org.example.ht.model;

import lombok.Builder;
import lombok.Data;
import org.example.ht.anno.Info;

/**
 * @description:
 * @author: VICooL
 * @create: 2023-12-18 17:39
 **/
@Data
@Builder
@Info(isDelete = true)
public class Person {
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 是否有效
     */
    private boolean isDelete;

}
