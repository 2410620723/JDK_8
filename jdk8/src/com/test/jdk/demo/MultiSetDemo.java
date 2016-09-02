package com.test.jdk.demo;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class MultiSetDemo {
	public static void main(String[] args) {
		String str = "wer|dfd|dd|dfd|dda|de|dr";
		String[] words = str.split("\\|");
		List<String> strList = new ArrayList<>();
		for(String s : words){
			strList.add(s);
		}
		/*Multiset<String> multiSet = HashMultiset.create();
		multiSet.addAll(strList);*/
		Multiset<String> multiSet = HashMultiset.create(strList);
		for(String key : multiSet.elementSet()){
			System.out.println(key+" count:"+multiSet.count(key));
		}
		System.out.println("=========================");
		
		if(!multiSet.contains("hello")){
			multiSet.add("hello", 2);
		}
		for(String key : multiSet.elementSet()){
			System.out.println(key+" count:"+multiSet.count(key));
		}
		System.out.println("=========================");
		
		if(multiSet.contains("hello")){
			multiSet.setCount("hello", 2, 4);//���hello���ֵĴ�������2�Ļ�����hello���ֵĴ������ᱻ��ֵΪ4
		}
		for(String key : multiSet.elementSet()){
			System.out.println(key+" count:"+multiSet.count(key));
		}
		System.out.println("=========================");
		
		if(multiSet.contains("hello")){
			multiSet.setCount("hello", 2, 10);//���hello���ֵĴ�������2�Ļ�����hello���ֵĴ������ᱻ��ֵΪ10
		}
		for(String key : multiSet.elementSet()){
			System.out.println(key+" count:"+multiSet.count(key));
		}
		
	}
}
