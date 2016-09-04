package com.test.jdk.demo;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;

/**
 * JDK8����ʽ�ӿ�
 * @author Administrator
 *
 */
public class FunctionInterface {
	public static void main(String[] args) {
		//Function<T, R> -T��Ϊ���룬���ص�R��Ϊ��� 
		Function<String,String> function = (x) -> {System.out.print(x+":"); return "Function";};
		System.out.println(function.apply("Function"));
		
		//Predicate<T> -T��Ϊ���룬���ص�booleanֵ��Ϊ���  
		Predicate<String> pre = (x) -> {System.out.print(x+":"); return true;};
		System.out.println(pre.apply("Predicate"));
		
		//Consumer<T> - T��Ϊ���룬ִ��ĳ�ֶ�����û�з���ֵ
		Consumer<String> con = (x) -> System.out.println(x);
		con.accept("Consumer");
		
		//Supplier<T> - û���κ����룬����T
		Supplier<String> sup = () -> {return "hello Supplier";};
		System.out.println(sup.get());
		
		BinaryOperator<String> bina = (x,y) ->{System.out.print(x+" "+y);return "BinaryOperator";};  
        System.out.println("  "+bina.apply("hello ","world"));  
	}
}
