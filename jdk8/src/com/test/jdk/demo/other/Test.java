package com.test.jdk.demo.other;

public class Test{
	public static void main(String[] args) {
		new ExtendsAbstractClass().show();
	}
}
class EntityClass {
	public void show(){
		System.out.println("test");
	}
	
}
abstract class AbstractClass extends EntityClass{
	
}
class ExtendsAbstractClass extends AbstractClass{
	
}