package com.test.jdk.demo.generic.demo;
/**
 * 在非泛型类中创建泛型方法
 * 类型参数在方法返回值之前声明。其次，T扩展了Comparable<T>接口，表明isIn()方法只能用于可被比较的对象中。
 * Comparable<T>是泛型接口
 * T为类型V设置了上界，因此V必须为T或T的子类。
 * 泛型方法既可以是静态的也可以是非静态的。
 * @author zxm
 *
 */
public class CreateGenericMethod {
	public <T extends Comparable<T>,V extends T> boolean isIn(T x,V[] y){
		for(int i=0;i<y.length;i++){
			if(x.equals(y[i]))
				return true;
		}
		return false;
	}
}
