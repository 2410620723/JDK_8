package com.test.jdk.demo.annotation_demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Ϊע���Ա���Ĭ��ֵ
 * ʹ��default
 * @author zxm
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnoForDefaultValue {
	public String str() default "Testing";
	public int val() default 100;
}
