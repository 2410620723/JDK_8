package com.test.jdk.demo;

import com.test.jdk.bean.Person;

/**
 * 创建对象的四种方法
 * @author zxm
 *
 */
public class EstablishObject {
	public static void main(String[] args) {
		/*
		 * 1.用new语句创建对象
		 */
		Person person1 = new Person("Jack",24);
		System.out.println("new:" + person1);
		/*
		 * 2.运用反射手段,调用java.lang.Class或者java.lang.reflect.Constructor类
		 * 的newInstance()实例方法
		 */
		try {
			Person person2 = Person.class.newInstance();
			person2.setName("Hello");
			person2.setAge(20);
			System.out.println("反射:" + person2);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		Class<?> c = null;
		Person person4 = null;
		try {
			c = Class.forName("com.test.jdk.bean.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			person4 = (Person) c.newInstance();
			person4.setName("Hello");
			person4.setAge(20);
			System.out.println("person4:" + person4.toString());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		/*
		 * 3.调用对象的clone()方法。
		 */
		try {
			Person person3 = (Person) person1.clone();
			person3.setName("Hello");
			person3.setAge(20);
			System.out.println("person3:"+person3.toString());
		} catch (CloneNotSupportedException e1) {
			e1.printStackTrace();
		}
		
		/*
		 * 4.反序列化
		 */
		
	}
}
