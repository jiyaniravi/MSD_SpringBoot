package com.af.msd.common.aspect;

import com.af.msd.common.util.ArrayToStringConverter;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class APICallStackLogger {

    private static final Logger LOG = LoggerFactory.getLogger(APICallStackLogger.class);

    @Pointcut("execution(* com.af.msd..controller..*(..)) || execution(* com.af.msd..service..*(..)) || execution(* com.af.msd..dao..*(..))")
    public void callToAllTheLayersAPI(){}

    @Before("callToAllTheLayersAPI()")
    public void logCalledAPIBefore(JoinPoint joinPoint){ log(joinPoint, "Start : "); }

    @After("callToAllTheLayersAPI()")
    public void logCalledAPIAfter(JoinPoint joinPoint){ log(joinPoint, "End : "); }

    private void log(JoinPoint joinPoint, String prefix) {
        LOG.debug(prefix + joinPoint.getSignature() + " : With Parameters : "
                         + ArrayToStringConverter.getStringFromArrayElements(joinPoint.getArgs()));
    }
}
