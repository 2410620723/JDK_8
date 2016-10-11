package com.test.jdk.demo.annotation.demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface What {
	public String description();
}
