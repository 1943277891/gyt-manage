package com.eight.gytManage.aop;

import com.alibaba.fastjson.JSON;
import com.eight.gytManage.aop.LoginAnnotation;
import com.eight.gytManage.utils.HttpContextUtils;
import com.eight.gytManage.utils.IPUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.boot.devtools.tunnel.payload.HttpTunnelPayload;
import org.springframework.core.log.LogAccessor;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

import static java.awt.SystemColor.info;

@Component
@Aspect
@Slf4j
public class LoginLogAop{

    @Pointcut("@annotation(com.eight.gytManage.aop.LoginAnnotation)")
    public void pt(){}

    @Around("pt()")

    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        long beginTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long time = System.currentTimeMillis()-beginTime;
        recordLog(joinPoint,time);
        return result;
    }
    private void recordLog(ProceedingJoinPoint joinPoint, long time){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        LoginAnnotation loginAnnotation = method.getAnnotation(LoginAnnotation.class);
        log.info("==============start===============");
        log.info("module:{}",loginAnnotation.module());
        log.info("operator:{}",loginAnnotation.operator());

        //请求的方法名
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = signature.getName();
        log.info("request:method:{}",className+"."+methodName+"()");

        //请求的参数
        Object[] args = joinPoint.getArgs();
        String params = JSON.toJSONString(args[0]);
        log.info("params:{}",params);

        //获取request 设置ip地址
        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
        log.info("ip:{}", IPUtils.getIpAddr(request));


        log.info("excute time : {} ms",time);
        log.info("==============end===============");

    }
}