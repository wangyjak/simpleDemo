package com.simpleDemo.thread;

import java.util.concurrent.Callable;

/**
 * @author : majh
 * createDate : 2019/5/13 17:15
 * descripe :多线程返回参数
 */

public class CallableDemo implements Callable {

    @Override
    public String call() throws Exception{
        String value = "test";
        System.out.println("ready to work");
        Thread.currentThread().sleep(5000);
        System.out.println("work done");
        return value;
    }
}
