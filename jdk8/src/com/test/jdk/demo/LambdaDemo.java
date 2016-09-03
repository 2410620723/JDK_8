package com.test.jdk.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;
import com.test.jdk.bean.Person;


public class LambdaDemo {
	public static void main(String[] args) {
		List<Person> humans = Lists.newArrayList(new Person("Sarah", 10), new Person("Jack", 12));
		
		humans.sort((h1,h2) -> h1.getName().compareTo(h2.getName()));
		System.out.println(humans);
		
	}
	
	public static int compareByNameThenAge(Person lhs, Person rhs) {
		if (lhs.name.equals(rhs.name)) {
			return lhs.age - rhs.age;
		} else {
			return lhs.name.compareTo(rhs.name);
		}
	}
	
	@Test
	public void testCompareByNameThenAge(){
		List<Person> humans = Lists.newArrayList(new Person("Sarah", 10), new Person("Jack", 12));
		
		//有问题，未解决
//		humans.sort(Person::compareByNameThenAge);
		System.out.println(humans);
	}
	
	@Test
	public void testComparatorComparing(){
		List<Person> humans = Lists.newArrayList(new Person("Sarah", 10), new Person("Jack", 12));
		Collections.sort(humans, Comparator.comparing(Person::getName));
		System.out.println(humans);
	}
	
	@Test
	public void testSortReverse(){
		List<Person> humans = Lists.newArrayList(new Person("Sarah", 10), new Person("Jack", 12));
		Comparator<Person> comparator = (p1,p2) -> p1.getName().compareTo(p2.getName());
		humans.sort(comparator.reversed());
		System.out.println(humans);
	}
	
	@Test
	public void testOrderByNameThenByAge(){
		List<Person> humans = Lists.newArrayList(new Person("Sarah",10),new Person("Jack",12),new Person("Sarah",7));
		humans.sort((p1,p2) -> {
			if(p1.getName().equals(p2.getName())){
				return p1.getAge()-p2.getAge();
			}else{
				return p1.getName().compareTo(p2.getName());
			}
		});
		System.out.println(humans);
	}
	
	@Test
	public void testOrderByNameThenByAgeWithComparator(){
		List<Person> humans = Lists.newArrayList(new Person("Sarah",10),new Person("Jack",12),new Person("Sarah",7));
		humans.sort(Comparator.comparing(Person::getName).reversed().thenComparing(Person::getAge));
		System.out.println(humans);
	}
}
