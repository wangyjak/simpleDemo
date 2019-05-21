package com.simpleDemo.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author : majh
 * createDate : 2019/5/20 21:01
 * descripe :反射案例
 */

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class rc = Class.forName("com.simpleDemo.reflect.Robot");
        Robot robot = (Robot) rc.newInstance();
        System.out.println("Class name is "+rc.getName());
        Method throwHello = rc.getDeclaredMethod("throwHello", String.class);
        throwHello.setAccessible(true);
        Object str = throwHello.invoke(robot,"Eva");
        System.out.println("throwHello result is "+str);
        Method sayHello = rc.getMethod("sayHello", String.class);
        sayHello.invoke(robot,"welcome");
        Field name = rc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(robot,"Alice");
        sayHello.invoke(robot,"welcome");
    }
}
