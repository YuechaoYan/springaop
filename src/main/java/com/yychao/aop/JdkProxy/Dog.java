package com.yychao.aop.JdkProxy;

public class Dog implements Runnable {
    @Override
    public void run(){
        System.out.println("I am running!");
    }

}
