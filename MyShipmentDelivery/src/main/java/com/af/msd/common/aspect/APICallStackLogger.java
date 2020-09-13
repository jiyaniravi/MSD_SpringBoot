package com.af.msd.common.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class APICallStackLogger {

    @Before(value = "execution(* com.af.msd.controller.address.AddressController.*(..))")
    public void logCalledAPIBefore(){
        System.out.println("Method start");
    }

    @After(value = "execution(* com.af.msd.controller.address.AddressController.*(..))")
    public void logCalledAPIAfter(){
        System.out.println("Method end");
    }
}
