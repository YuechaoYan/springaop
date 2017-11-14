package com.yychao.aop.dao;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//表示该类是一个通知类
@Aspect
@Component
public class MyAspectXml {

    @Pointcut("execution(* com.yychao.aop.dao.impl.OrderDaoImpl.save(..))")
    public void pc(){
    }
    // 前置增强
    @Before("execution(* com.yychao.aop.dao.impl.OrderDaoImpl.save(..))")
    public void before(){
        System.out.println("前置增强===========");
    }
    @After("MyAspectXml.pc()")
    public void after(){
        System.out.println("后置增强============");
    }
    @AfterReturning("MyAspectXml.pc()")
    public void afterReturn(){
        System.out.println("after return =============");
    }
    @Around("MyAspectXml.pc()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before ========================");
        Object o = pjp.proceed();//调用目标对象方法
        System.out.println("around after========================");
        return o;
    }

}
