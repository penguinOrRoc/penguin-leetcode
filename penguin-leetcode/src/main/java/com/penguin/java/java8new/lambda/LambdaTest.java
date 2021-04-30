package com.penguin.java.java8new.lambda;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Comparator;

public class LambdaTest {
    public static void main(String[] args){
        /**
         * 3.::关键字 便捷的使用类的构造器和方法
         */
        DefaultInterface di3 = LambdaService :: mul;
        di3.mul(1,7);
        /**
         *2.函数式接口
         */
        int c = 1;
        DefaultInterface di2 = (a,b) -> a*b+c;
        System.out.println(di2.mul(5,10));
        /**
         * 1.default 关键字测试
         */
        DefaultInterface di1 = new DefaultInterface(){
            //即使接口中所有方法都有default实现，接口也不能直接实例化。
            @Override
            public int mul(int a, int b) {
                return a*b;
            }
        };
        System.out.println(di1.add(1,2));
        System.out.println(di1.sub(1,2));

    }
}
