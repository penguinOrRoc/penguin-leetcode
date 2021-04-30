package com.penguin.java.java8new.lambda;

public interface DefaultInterface {
    default int add(int a, int b) {
        return a + b;
    }
     default int sub(int a,int b){
         return a-b;
     }
     int mul(int a, int b);

}
