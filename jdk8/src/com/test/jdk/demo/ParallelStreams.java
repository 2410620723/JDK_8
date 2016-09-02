package com.test.jdk.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class ParallelStreams {
	
	@Test
	public void test1(){
		int max = 1000000;
		List<String> values = new ArrayList<String>();
		for(int i=0;i<max;i++){
			UUID id = UUID.randomUUID();
			values.add(id.toString());
		}
		long t0 = System.nanoTime();
		//ʹ����������������
		long count = values.stream().sorted().count();
		System.out.println("count:"+count);
		long t1 = System.nanoTime();
		long millis = TimeUnit.NANOSECONDS.toMillis(t1-t0);
		System.out.println("��������ʱ��:"+millis);
	}
	@Test
	public void test2(){
		int max = 1000000;
		List<String> values = new ArrayList<String>();
		for(int i=0;i<max;i++){
			UUID id = UUID.randomUUID();
			values.add(id.toString());
		}
		long t0 = System.nanoTime();
		//ʹ�ò�������������
		long count = values.parallelStream().sorted().count();
		System.out.println("count:"+count);
		long t1 = System.nanoTime();
		long millis = TimeUnit.NANOSECONDS.toMillis(t1-t0);
		System.out.println("��������ʱ��:"+millis);
	}
	
}
