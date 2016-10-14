package com.test.jdk.demo;

import com.test.jdk.bean.Person;

/**
 * ������������ַ���
 * @author zxm
 *
 */
public class EstablishObject {
	public static void main(String[] args) {
		/*
		 * 1.��new��䴴������
		 */
		Person person1 = new Person("Jack",24);
		System.out.println("new:" + person1);
		/*
		 * 2.���÷����ֶ�,����java.lang.Class����java.lang.reflect.Constructor��
		 * ��newInstance()ʵ������
		 */
		try {
			Person person2 = Person.class.newInstance();
			person2.setName("Hello");
			person2.setAge(20);
			System.out.println("����:" + person2);
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
		 * 3.���ö����clone()������
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
		 * 4.�����л�
		 */
		
	}
}
