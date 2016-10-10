package com.test.jdk.demo.other;

/**
 * 测试instanceof
 * 判断变量类型是否与给定的类型匹配
 * @author zxm
 *
 */
public class TestInstanceof {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		if(a instanceof A) System.out.println("a is instanceof A");
		if(b instanceof B) System.out.println("b is instanceof B");
		if(c instanceof C) System.out.println("c is instanceof C");
		if(d instanceof D) System.out.println("d is instanceof D");
		A aa = d;
		if(aa instanceof D) System.out.println("aa is instanceof D");
		
	}
}

class A{
	int i,j;
}
class B{
	int i,j;
}
class C extends A{
	int k;
}
class D extends A{
	int k;
}