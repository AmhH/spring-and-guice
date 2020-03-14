package com.example.guice.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.logging.Logger;

/**
 *
 * @author baeldung
 */
public class MessageLogger implements MethodInterceptor {


    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] objectArray = invocation.getArguments();
        int i = 0;
        for (Object object : objectArray) {
            Logger.getAnonymousLogger().info("Sending message: " + object.toString());
        }
        return invocation.proceed();
    }
}