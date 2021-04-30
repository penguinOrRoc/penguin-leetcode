package com.penguin.java.juc.callable;

import java.util.concurrent.*;

public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.创建线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        //2.执行callable任务
        Future<String> future
                = executorService.submit(new PCallable( (int) Math.random() * 100));
        System.out.println(future.get());
        if (future.isDone()){
            executorService.shutdown();
        }


    }
}

