package com.test.jdk.demo.annotation_demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 标记注解
 * 不包含成员，其唯一目的就是标记声明
 * @author zxm
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyMarker {

}
