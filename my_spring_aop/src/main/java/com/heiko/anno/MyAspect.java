package com.heiko.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect //标注当前MyAspect是一个界面类
public class MyAspect {
    //配置前置通知
    @Before(value="execution(public void com.heiko.anno.Target.save())")
    public void before() {
        System.out.println("前置增强...");
    }

    /*@AfterReturning("execution(public void com.heiko.anno.Target.save())")
    public void afterReturning() {
        System.out.println("后置增强...");
    }*/

    @AfterReturning("pointcut()")
    public void afterReturning() {
        System.out.println("后置增强...");
    }

    @Around("execution(public void com.heiko.anno.Target.save())")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强...");
        pjp.proceed(); //切点方法
        System.out.println("环绕后增强...");
        return pjp;
    }

    @AfterReturning("execution(public void com.heiko.anno.Target.save())")
    public void afterThrowing(){
        System.out.println("异常抛出增强...");
    }

    /*@After("execution(public void com.heiko.anno.Target.save())")
    public void after(){
        System.out.println("最终增强...");
    }*/

    @After("MyAspect.pointcut()")
    public void after(){
        System.out.println("最终增强...");
    }

    @Pointcut("execution(public void com.heiko.anno.Target.save())")
    public void pointcut(){

    }
}
