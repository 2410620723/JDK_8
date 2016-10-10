package com.test.jdk.demo.other;

/**
 * assert后面表达式为true时，程序可以继续执行，当表达式为false时，抛出AssertionError异常
 * eclipse打开断言
 * Window->preferences->java->installed JREs->选中相应的JREs->edit->在default VM arguments中输入"-ea"(或者-enableassertions)
 * @author zxm
 *
 */
public class TestAssert {
	static int val = 3;
	static int getNum(){
		return val--;
	}
	public static void main(String[] args) {
		int n;
		for(int i=0;i<10;i++){
			n = getNum();
			assert n > 0 : "n is negative";
			System.out.println("n is "+n);
		}
		
	}
}
