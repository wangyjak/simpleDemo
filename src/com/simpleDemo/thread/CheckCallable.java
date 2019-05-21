package com.simpleDemo.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author : majh
 * createDate : 2019/5/13 17:50
 * descripe :Callable类需使用futureTask作为接收
 */

public class CheckCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<String>(new CallableDemo());
        new Thread(futureTask).start();
        if(!futureTask.isDone()){
            System.out.println("task is not finished");
        }
        System.out.println("result is "+futureTask.get());
    }
}
