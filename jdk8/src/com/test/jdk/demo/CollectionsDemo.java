package com.test.jdk.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
/**
 * ����
 * @author zxm
 *
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		List<String> stringCollection = new ArrayList<String>();
		stringCollection.add("aaa2");
		stringCollection.add("aaa1");
		stringCollection.add("bbb1");
		
		//�������������е�Ԫ�ؽ��й���
//		stringCollection.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);
		
		//����һ���������������ͼ��������ı�ԭ��������Ԫ�ص�˳��ԭ��string�����е�Ԫ��˳����û�иı�ġ� 
//		stringCollection.stream().sorted().forEach(System.out::println);
		
		/*map��һ��������������м������ͨ�������ķ��������ܹ����������е�ÿһ��Ԫ�ض�Ӧ������һ�������ϡ�
		 *��������Ӿ���ʾ����ΰ�ÿ��string��ת���ɴ�д��string. ������ˣ��㻹���԰�ÿһ�ֶ���ӳ���Ϊ�������͡�
		 *���ڴ����ͽ���������󣬾�������ͻ�Ҫ�ɴ��ݸ�map�ķ��ͷ�����������
		*/
//		stringCollection.stream().map(String::toUpperCase).sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);
		
		//����һ��Ԫ������a��ͷ��
		boolean anyStartWithA = stringCollection.stream().anyMatch((s) -> s.startsWith("a"));
		System.out.println(anyStartWithA);
		
		//���е�Ԫ�ض�����a��ͷ��
		boolean allStartWithA = stringCollection.stream().allMatch((s) -> s.startsWith("a"));
		System.out.println(allStartWithA);
		
		//û��Ԫ������c��ͷ��
		boolean noneStartWithA = stringCollection.stream().noneMatch((s) -> s.startsWith("c"));
		System.out.println(noneStartWithA);
		
		//Count��һ���ս���������������Ƿ���һ����ֵ��������ʶ��ǰ�������а�����Ԫ�������� 
		long countStartWithA = stringCollection.stream().filter((s) -> s!=null).count();
		System.out.println(countStartWithA);
		
		//ʹ��stream��list���Ͻ�������Ȼ����ת����list����
		List<String> stringList = stringCollection.stream().sorted().collect(Collectors.toList());
		System.out.println(stringList);
		
		//�ò�����һ���ս���������ܹ�ͨ��ĳһ����������Ԫ�ؽ��������������ò����Ľ�������һ��Optional�����ﷵ�ء� 
		Optional<String> reduces = stringCollection.stream().reduce((s1,s2) -> s1+"#"+s2);
		reduces.ifPresent(System.out::println);
		
	}
}
