package com.test.jdk.demo.generic.demo;
/**
 * 泛型通配符(?)
 * @author zxm
 *
 */
public class WildcardGeneric<T extends Number> {
T[] nums;
	
	public WildcardGeneric(T[] o){
		nums = o;
	}
	
	public double average(){
		double sum = 0.0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i].doubleValue();
		}
		return sum/nums.length;
	}
	
	/*
	 * 如果将"?"改成"T"在调用该方法的时候可能会因为不同类的泛型不同而报错
	 */
	public boolean sameAve(WildcardGeneric<?> ob){
		if(average()==ob.average())
			return true;
		else
			return false;
	}
}
