package com.test.jdk.demo;

/**
 * java �����в���
 * @author zxm
 * Run COnfigure -> Arguments -> Program arguments(����֮���Կո�ָ�)
 *
 */
public class JavaCommandLine {

	public static void main(String[] args) {
		for(int i=0;i<args.length;i++){
			System.out.println("args["+i+"]:"+args[i]);
		}

	}

}
