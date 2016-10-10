package com.test.jdk.demo.other;
/**
 * 使用this()调用重载的构造方法(必须放在构造方法的第一行)
 * this()适用于包含大量初始化代码的构造函数
 * 注意：1，使用this()时不能使用当前类的任何实例变量；2，同一构造方法不能同时使用this()与super()，因为它们都必须放在第一行
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
