package com.test.jdk.demo.Enum.demo;
/**
 * Javaö���������͵ģ�����Ϊ���ṩ���캯����ʵ������
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
