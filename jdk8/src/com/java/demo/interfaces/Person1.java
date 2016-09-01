package com.java.demo.interfaces;

@Authority(role = "person1")
@Authority(role = "person2")
public class Person1 {
	
}

@Authorities({@Authority(role="person1"),@Authority(role="person2")})
class Person2 {
	
}
