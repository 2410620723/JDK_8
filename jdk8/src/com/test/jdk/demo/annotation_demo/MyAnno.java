package com.test.jdk.demo.annotation_demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 注解(元数据)
 * 指定保留策略:SOURCE、CLASS、RUNTIME
 * 使用SOURCE保留策略的注解，只在源文件中保留，在编译期间会被抛弃；
 * 使用CLASS保留策略的注解，在编译时被保存到.class文件中，但是在运行时通过JVM获取不到这些注解
 * 使用RUNTIME保留策略的注解，在编译时被保存到.class文件中，并且在运行时通过JVM可以获取这些注解。
 * 因此RUNTIME保留策略提供最永久的注解。
 * @author zxm
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
	public String str();
	public int val();
}
