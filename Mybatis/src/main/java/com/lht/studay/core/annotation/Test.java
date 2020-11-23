package com.lht.studay.core.annotation;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        // 获取接口的字节码文件
        Class classes = Class.forName("com.lht.studay.core.annotation.AnnotationImpl");
        // 获取接口的所有方法
        Method[] methods = classes.getMethods();
        for (Method method:methods){
            // 判断方法是否使用Select进行注解。
            boolean isAnnotated = method.isAnnotationPresent(Select.class);
            if (isAnnotated){
                // 获取注解的内容
                Select select = method.getAnnotation(Select.class);
                String value = select.value();
                System.out.println(value);
            }
        }

    }
}
