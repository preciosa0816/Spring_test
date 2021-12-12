package com.education.springbbs.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class TimeCheckAdvice {

	

	public Object timeCheck(ProceedingJoinPoint pjp) throws Throwable {
        String methodName = pjp.getKind();
        
        StopWatch sw = new StopWatch();
        
        sw.start(methodName);
        
        System.out.println("[LOG] METHOD: " + pjp.getSignature().getName() + " is calling.");
        Object rtnObj = pjp.proceed();
        
        sw.stop();
        
        System.out.println("[LOG] METHOD: " +  pjp.getSignature().getName() + " was called.");
        System.out.println("[LOG] 처리시간 " + sw.getTotalTimeMillis() / 1000 + "초");
        
        return rtnObj;
	}
}
