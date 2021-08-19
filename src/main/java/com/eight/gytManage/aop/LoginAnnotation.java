package com.eight.gytManage.aop;

import java.lang.annotation.*;

@Target({ElementType.METHOD}) //可以放在方法上
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginAnnotation {
    String module() default "";
    String operator() default "";
}
