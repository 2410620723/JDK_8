package com.test.jdk.demo.Enum.demo;
/**
 * Java枚举是类类型的，可以为其提供构造函数、实例变量
 * @author zxm
 *
 */
public enum AppleConstructor {
	Hello(10),
	World(12);
	
	private int price;

	private AppleConstructor() {
	}

	private AppleConstructor(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
