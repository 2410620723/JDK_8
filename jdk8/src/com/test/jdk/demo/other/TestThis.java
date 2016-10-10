package com.test.jdk.demo.other;
/**
 * ʹ��this()�������صĹ��췽��(������ڹ��췽���ĵ�һ��)
 * this()�����ڰ���������ʼ������Ĺ��캯��
 * ע�⣺1��ʹ��this()ʱ����ʹ�õ�ǰ����κ�ʵ��������2��ͬһ���췽������ͬʱʹ��this()��super()����Ϊ���Ƕ�������ڵ�һ��
 * @author zxm
 *
 */
public class TestThis {
	public static void main(String[] args) {
		Class1 class1 = new Class1();
		System.out.println("class1:"+class1.toString());
		
		Class2 class2 = new Class2(8);
		System.out.println("class2:"+class2);
	}
}
class Class1{
	int a;
	int b;
	Class1(int i,int j){
		a = i;
		b = j;
	}
	Class1(int i){
		a = i;
		b = i;
	}
	Class1(){
		
	}
	@Override
	public String toString() {
		return "Class1 [a=" + a + ", b=" + b + "]";
	}
	
}
class Class2{
	int a;
	int b;
	Class2(int i,int j){
		a = i;
		b = j;
	}
	Class2(int i){
		this(i,i);
	}
	Class2(){
		
	}
	@Override
	public String toString() {
		return "Class2 [a=" + a + ", b=" + b + "]";
	}
	
}
