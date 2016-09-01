package com.java.demo.map;

import java.util.HashMap;
import java.util.Map;


public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		for(int i=0;i<10;i++){
			map.putIfAbsent(i, "value"+i);
		}
		//遍历map集合
//		map.forEach((key,value) -> System.out.println(key+":"+value));
		
		map.computeIfPresent(3, (num,val) -> val+num*10);//将key为3的value修改成value330
		System.out.println(map.get(3));//value330
		
		//将key为9的value改成null
		map.computeIfPresent(9, (num,value) -> null);
		System.out.println(map.containsKey(9));//false
		
		map.computeIfAbsent(23, num -> "value"+num*10);
		System.out.println(map.get(23));//value230
		
		//如果key为9对应的value为null，则将其赋值为bean
		map.computeIfAbsent(9, value -> "bean");
		System.out.println(map.get(9));//bean
		
		System.out.println(map.get(9));
		map.remove(9, "value9");
		System.out.println(9+":"+map.get(9));
//		删除给定键所对应的元素。删除操作还需要满足给定的值需要和map中的值相等： 
		map.remove(9, "bean");
		System.out.println(9+":"+map.get(9));
		
		//获取key，并将其赋值为给定的默认值
		System.out.println(map.getOrDefault(10, "not found"));
		
		//合并实体value
		map.merge(9, "value9", (value,newValue) -> value.concat(newValue));
		System.out.println(map.get(9));
		map.merge(9, "concat", (value,newValue) -> value.concat(newValue));
		System.err.println(map.get(9));
	}
}
