package com.heiko.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void before() {
        System.out.println("前置增强...");
    }

    public void afterReturning() {
        System.out.println("后置增强...");
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强...");
        pjp.proceed(); //切点方法
        System.out.println("环绕后增强...");
        return pjp;
    }

    public void afterThrowing(){
        System.out.println("异常抛出增强...");
    }

    public void after(){
        System.out.println("最终增强...");
    }
}
