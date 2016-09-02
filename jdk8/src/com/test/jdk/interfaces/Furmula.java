package com.test.jdk.interfaces;
/**
 * 在接口Formula中，除了抽象方法caculate以外，还定义了一个默认方法sqrt。
 * Formula的实现类只需要实现抽象方法caculate就可以了。默认方法sqrt可以直接使用。 
 * @author zxm
 *
 */
public interface Furmula {
	double calculator(int a);
	
	default double sqrt(int a){
		return Math.sqrt(a);
	}
}
