package com.test.jdk.demo.annotation_demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 * <p>单成员注解：只包含一个成员</p>
 * <p>如果只有一个成员，使用注解的时候，就可以简单的为该成员指定值，而不需要指定成员的名称，
 * 但是为了使用这种缩写形式，成员名称必须为value。</p>
 * 
 * @author zxm
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
	public int value();
}
