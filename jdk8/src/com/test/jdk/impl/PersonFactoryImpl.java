package com.test.jdk.impl;

import com.test.jdk.bean.Person;
import com.test.jdk.interfaces.PersonFactory;

public class PersonFactoryImpl {
	public static void main(String[] args) {
		PersonFactory<Person> person = Person::new;
		person.create("Mack", 20);
		System.out.println("person:"+person);
	}
}
