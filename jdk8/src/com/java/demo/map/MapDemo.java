package com.java.demo.map;

import java.util.HashMap;
import java.util.Map;


public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		for(int i=0;i<10;i++){
			map.putIfAbsent(i, "value"+i);
		}
		//����map����
//		map.forEach((key,value) -> System.out.println(key+":"+value));
		
		map.computeIfPresent(3, (num,val) -> val+num*10);//��keyΪ3��value�޸ĳ�value330
		System.out.println(map.get(3));//value330
		
		//��keyΪ9��value�ĳ�null
		map.computeIfPresent(9, (num,value) -> null);
		System.out.println(map.containsKey(9));//false
		
		map.computeIfAbsent(23, num -> "value"+num*10);
		System.out.println(map.get(23));//value230
		
		//���keyΪ9��Ӧ��valueΪnull�����丳ֵΪbean
		map.computeIfAbsent(9, value -> "bean");
		System.out.println(map.get(9));//bean
		
		System.out.println(map.get(9));
		map.remove(9, "value9");
		System.out.println(9+":"+map.get(9));
//		ɾ������������Ӧ��Ԫ�ء�ɾ����������Ҫ���������ֵ��Ҫ��map�е�ֵ��ȣ� 
		map.remove(9, "bean");
		System.out.println(9+":"+map.get(9));
		
		//��ȡkey�������丳ֵΪ������Ĭ��ֵ
		System.out.println(map.getOrDefault(10, "not found"));
		
		//�ϲ�ʵ��value
		map.merge(9, "value9", (value,newValue) -> value.concat(newValue));
		System.out.println(map.get(9));
		map.merge(9, "concat", (value,newValue) -> value.concat(newValue));
		System.err.println(map.get(9));
	}
}
