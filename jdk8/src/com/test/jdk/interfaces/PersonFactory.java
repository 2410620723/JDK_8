package com.test.jdk.interfaces;

import com.test.jdk.bean.Person;

public interface PersonFactory<P extends Person> {
	P create(String name,int age);
}
