package com.test.jdk.demo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;

public class ImmutableDemo {
	@Test
	public void testUnmodifiableXXX() {
		
		//测试JDK中的Collections.unmodifiableXXX系列方法来实现不可变集合
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println("list:"+list);
		List<String> unmodifiableList = Collections.unmodifiableList(list);
		System.out.println("unmodifiableList:"+unmodifiableList);
		List<String> unmodifiableList1 = Collections.unmodifiableList(Arrays.asList("a","b","c"));
		System.out.println("unmodifiableList1:"+unmodifiableList1);
		String temp = unmodifiableList.get(1);
		System.out.println("unmodifiableList[1]:"+temp);
		list.add("d");
		System.out.println("after add an item list is:"+list);
		System.out.println("after add an item unmodifiableList is:"+unmodifiableList);
		//运行报错
		unmodifiableList1.add("d");
		System.out.println("after add an item unmodifiableList1 is:"+unmodifiableList1);
	}
	
	@Test
	public void testGuavaImmutable(){
		List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("list："+list);
        ImmutableList<String> immutableCopyList = ImmutableList.copyOf(list);
        System.out.println("immutableList:"+immutableCopyList);
        
        ImmutableList<String> immutableOfList = ImmutableList.of("a","b","c");
        System.out.println("immutableOfList:"+immutableOfList);
        
        list.add("d");
        System.out.println("after add an item list is:"+list);
        System.out.println("after add an item immutableCopyList is:"+immutableCopyList);
        
        //创建不可变set时进行排序
        ImmutableSortedSet<String> immutableSortedSet = ImmutableSortedSet.of("a", "e", "c", "a", "d", "b");
        System.out.println("immutableSortedSet:"+immutableSortedSet);
        
        ImmutableSet<Color> immutableSetColor = ImmutableSet.<Color>builder().add(new Color(255, 0, 0)).add(new Color(0,255,0)).add(new Color(0,0,255)).build();
        System.out.println("immutableSetColor:"+immutableSetColor);
        
	}
	
	@Test
	public void testCopyOf(){
		ImmutableList<String> immutableList = ImmutableList.of("a","b","d","c","a");
		System.out.println("immutableList:"+immutableList);
		ImmutableSet<String> immutableSet = ImmutableSet.copyOf(immutableList);
		System.out.println("immutableSet:"+immutableSet);
		List<String> list = new ArrayList<>();
		for(int i=0;i<20;i++){
			list.add(i+"x");
		}
		ImmutableList<String> immutableListSubList = ImmutableList.copyOf(list.subList(2, 18));
		System.out.println("immutableListSubList:"+immutableListSubList);
		
	}
	
}
