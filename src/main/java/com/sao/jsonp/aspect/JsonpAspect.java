package com.sao.jsonp.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by navia on 2015/4/3.
 */
@Aspect
public class JsonpAspect {

    @Around(value = "execution(* com.sao.jsonp.controller.*.*(..))")
    public Object aroundAgeAdvice(ProceedingJoinPoint jp) throws Throwable {
        Object o = jp.proceed();
        return o;
    }
}
