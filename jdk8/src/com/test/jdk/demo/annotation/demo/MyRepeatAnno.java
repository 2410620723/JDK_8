package com.test.jdk.demo.annotation.demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * ÖØ¸´×¢½â
 * @author zxm
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRepeatAnno {
	RepeatAnno[] value();
}
