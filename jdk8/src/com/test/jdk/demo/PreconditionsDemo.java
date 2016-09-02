package com.test.jdk.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.common.base.Preconditions;

public class PreconditionsDemo {
	
	public static void getPerson(int age,String name) throws Exception{
		if(age>0&&name!=null&&name.isEmpty()!=true){
			System.out.println("age:"+age+",name:"+name);
		}else{
			System.out.println("输入有误");
		}
	}
	
	public static void getPersonByPreconditions(int age,String name) throws Exception{
		Preconditions.checkNotNull(name, "name不能为null");
		Preconditions.checkArgument(name.length()>0, "name为\'\'");
		Preconditions.checkArgument(age>0, "age必须大于0");
		System.out.println("age:"+age+",name:"+name);
	}
	
	public static void checkState(List<Integer> intList,int index) throws Exception{
		Preconditions.checkState(intList.size()< index, "intList的 size不能超过"+index);
	}
	
	public static void checkPositionIndex(List<Integer> intList,int index) throws Exception{
		Preconditions.checkPositionIndex(index, intList.size(), "index为"+index+"不再intList中，intList size为："+intList.size());
	}
	
	public static void checkPositionIndexes(List<String> intList,int index,int ends) throws Exception{
		Preconditions.checkPositionIndexes(index, ends, intList.size());
	}
	
	@Test
	public void testGetPerson() throws Exception{
		getPerson(-1, "jack");
	}
	
	public static void main(String[] args) {
		try {
			getPersonByPreconditions(10,null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			getPersonByPreconditions(10,"jack");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			getPersonByPreconditions(10,"");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			getPersonByPreconditions(-1,"jack");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		List<Integer> intList = new ArrayList<>();
		List<String>stringList = new ArrayList<>();
		stringList.add("a");
		stringList.add("b");
		try {
			for(int i=0;i<10;i++){
				checkState(intList, 9);
				intList.add(i);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			checkPositionIndex(intList, 3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			checkPositionIndex(intList, 10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
//			checkPositionIndexes(intList, 3, 10);
			checkPositionIndexes(stringList, 3, 10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
//			checkPositionIndexes(intList, 3, 10);
			checkPositionIndexes(stringList,10,4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
