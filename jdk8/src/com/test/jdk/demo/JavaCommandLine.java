package com.test.jdk.demo;

/**
 * java 命令行参数
 * @author zxm
 * Run COnfigure -> Arguments -> Program arguments(参数之间以空格分隔)
 *
 */
public class JavaCommandLine {

	public static void main(String[] args) {
		for(int i=0;i<args.length;i++){
			System.out.println("args["+i+"]:"+args[i]);
		}

	}

}
