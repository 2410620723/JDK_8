package com.test.jdk.demo.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.Test;

/**
 * 测试BufferedReader的Read()方法与ReadLine()方法
 * @author zxm
 *
 */
public class TestBufferedRead {
	@Test
	public void testRead() throws Exception {
		char c = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter characters 'q' to quit:");
		do{
				c = (char) br.read();
				System.out.println(c);
		}while(c != 'q');
	}
	
	@Test
	public void testReadLine() throws Exception{
		String str = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter strings 'q' to quit:");
		do{
			str = br.readLine();
			System.out.println(str);
		}while("q".equals(str));
	}
	
	@Test
	public void testReadLine2() throws Exception{
		String[] str = new String[100];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter strings 'q' to quit:");
		for(int i=0;i<100;i++){
			str[i] = br.readLine();
			if("q".equals(str[i])){
				break;
			}
		}
		System.out.println("here is you input:");
		for(int i=0;i<100;i++){
			if("q".equals(str[i])) break;
			System.out.println(str[i]);
		}
	}

}
