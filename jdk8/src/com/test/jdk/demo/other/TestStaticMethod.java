package com.test.jdk.demo.other;

import java.util.HashMap;
import java.util.Hashtable;

public class TestStaticMethod {
	public static void main(String[] args) {
		StaticMethod.show();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Hashtable<String, Integer> table = new Hashtable<>();
		map.put(null, null);
		table.put(null, null);//����ʱ�쳣����ָ���쳣
	}
}
