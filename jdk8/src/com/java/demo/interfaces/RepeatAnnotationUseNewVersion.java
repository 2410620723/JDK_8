package com.java.demo.interfaces;


public class RepeatAnnotationUseNewVersion {
	public static void main(String[] args) {
		Authority auth = Person1.class.getAnnotation(Authority.class);
		System.out.println("auth:"+auth);
		
		Authorities auths = Person1.class.getAnnotation(Authorities.class);
		System.out.println("auths:"+auths);
	}
	
}
