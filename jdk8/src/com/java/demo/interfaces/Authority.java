package com.java.demo.interfaces;

import java.lang.annotation.Repeatable;

@Repeatable(Authorities.class)
public @interface Authority {
	String role();
}
