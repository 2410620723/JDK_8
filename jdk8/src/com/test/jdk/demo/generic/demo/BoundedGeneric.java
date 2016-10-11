package com.test.jdk.demo.generic.demo;
/**
 * 有界类型泛型
 * 在指定类型参数是，声明超类的上限，所有的类型参数都必须衍生自超类
 * 使用extends字句
 * @author zxm
 *
 * @param <T>
 */
public class BoundedGeneric<T extends Number> {
	T[] nums;
	
	public BoundedGeneric(T[] o){
		nums = o;
	}
	
	public double average(){
		double sum = 0.0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i].doubleValue();
		}
		return sum/nums.length;
	}
}
