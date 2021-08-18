package com.icoom.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 测试控制器
 *
 * @author
 * @create
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class obj=Class.forName("com.icoom.demo.Dog");
        Dog dog = (Dog)obj.newInstance();
        dog.setId(345678);
        dog.setColour("黑");

        //初始化一个泛型为Integer的list并添加两个元素
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        //利用反射后去list的类型
        Class<? extends Object>  clazz=list.getClass();
        //获取list的add方法
        Method method = clazz.getMethod("add",Object.class);
        //调用list的add方法,将student对象存入list中
        method.invoke(list, dog);
        for (int i = 0; i < list.size(); i++) {
            if (i == 2)
            {
                Object obj1 = list.get(i);
                Dog dog1 = (Dog)obj1;
                System.out.println("dog1:==" + dog1.getId()+"&&&&"+dog1.getColour());
            }
            else
            {
                Integer integer =  list.get(i);
                System.out.println(integer);
            }
        }
        // System.out.println(list);

        // byte、short、long、int、float、double、char、blooean
    }
}
