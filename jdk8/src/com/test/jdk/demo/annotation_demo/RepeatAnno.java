package com.test.jdk.demo.annotation_demo;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * ÖØ¸´×¢½â
 * @author zxm
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatAnno.class)
public @interface RepeatAnno {
	String str() default "Tesing";
	int val() default 100;
}
