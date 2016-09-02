package com.test.jdk.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda±Ì¥Ô Ω
 * @author zxm
 *
 */
public class ListSort {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		Collections.sort(names,(String a,String b) -> {
			 return b.compareTo(a);
		});
//		Collections.sort(names, (String a,String b) -> b.compareTo(a));
		Collections.sort(names, (a,b) -> a.compareTo(b));
		
		System.out.println("names:" + names);
	}
}
