package org.example.ht.demo;

import org.example.ht.anno.Info;
import org.example.ht.model.Person;

import java.lang.annotation.Annotation;

/**
 * @description: 利用反射解析注解
 * @author: VICooL
 * @create: 2023-12-18 17:45
 **/
public class Demo {
    public static void main(String[] args) {
        try {
            // 获取Person的Class对象
            Person person = Person.builder().build();
            Class clazz = person.getClass();
            // 判断person对象上是否有infozhujie
            if(clazz.isAnnotationPresent(Info.class)){
                System.out.println("Person类上配置了Info注解");
                // 获取该对象上Info类型的注解
                Info annotation = (Info) clazz.getAnnotation(Info.class);
                System.out.println("person.name   :"+ annotation.value() + ",person.isDelete:"+annotation.isDelete());

            } else {
                System.out.println("Person类上没有配置Info注解！");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
