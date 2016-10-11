package com.test.jdk.demo.generic.demo;
/**
 * ����ͨ���(?)
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
	 * �����"?"�ĳ�"T"�ڵ��ø÷�����ʱ����ܻ���Ϊ��ͬ��ķ��Ͳ�ͬ������
	 */
	public boolean sameAve(WildcardGeneric<?> ob){
		if(average()==ob.average())
			return true;
		else
			return false;
	}
}
