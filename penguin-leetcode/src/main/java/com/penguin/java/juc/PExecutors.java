package com.penguin.java.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PExecutors {
    public static void main(String[] args){
        /**
         * JAVA线程池
         */
        //创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
        ExecutorService es1 = Executors.newCachedThreadPool();
        //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
        ExecutorService es2 = Executors.newFixedThreadPool(10);
        //创建一个定长线程池，支持定时及周期性任务执行
        ExecutorService es3 = Executors.newScheduledThreadPool(10);
        //单线程化线程池
        ExecutorService es4 = Executors.newSingleThreadExecutor();

        ExecutorService es5 = Executors.newSingleThreadScheduledExecutor();
        //抢占式操作的线程池
        ExecutorService es6 = Executors.newWorkStealingPool();

    }
}
