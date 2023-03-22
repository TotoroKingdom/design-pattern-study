package com.totoro.proxy;

import java.lang.annotation.*;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Select {

    String value() default "";

}
