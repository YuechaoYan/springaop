package com.yychao.aop.JdkProxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class DogProxy {

//   String[] stringArr = new String[]{"yan","chao"};
//   Class[] classArr = new Class[]{DogProxy.class};
    public static void main(String[] args){
        Dog dog = new Dog();
        Runnable dogProxy = (Runnable) Proxy.newProxyInstance(
                Dog.class.getClassLoader()
                , new Class[]{Runnable.class}
                , new InvocationHandler(){
                    /**
                     * @param proxy proxy是代理对象
                     * @param method method是方法目标方法的字节码对象
                     * @param args
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("add method before execute dog's method /主体方法运行前 。。。。。");
                        Object invoke = method.invoke(new Dog(), args);
                        System.out.println("add method after execute dog's method /主体方法运行后。。。。。。");
                        return invoke;
                    }
                } );
        dogProxy.run();// 调用invoke 方法
        System.out.println(Dog.class.getClassLoader() == Runnable.class.getClassLoader());
        System.out.println(Dog.class.getClassLoader() == DogProxy.class.getClassLoader());

    }
}
