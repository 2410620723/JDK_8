package com.test.jdk.demo.other;

/**
 * assert������ʽΪtrueʱ��������Լ���ִ�У������ʽΪfalseʱ���׳�AssertionError�쳣
 * eclipse�򿪶���
 * Window->preferences->java->installed JREs->ѡ����Ӧ��JREs->edit->��default VM arguments������"-ea"(����-enableassertions)
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
