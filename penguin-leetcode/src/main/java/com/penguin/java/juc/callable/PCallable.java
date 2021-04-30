package com.penguin.java.juc.callable;

import java.util.concurrent.Callable;

public class PCallable implements Callable<String> {
    int param;

    public PCallable(int param) {
        this.param = param;
    }

    public PCallable() {
    }

    @Override
    public String call() throws Exception {

        return Thread.currentThread().getName()+"---"+param;
    }
}
