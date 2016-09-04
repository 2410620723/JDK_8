package com.test.jdk.demo;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;

/**
 * JDK8函数式接口
 * @author Administrator
 *
 */
public class FunctionInterface {
	public static void main(String[] args) {
		//Function<T, R> -T作为输入，返回的R作为输出 
		Function<String,String> function = (x) -> {System.out.print(x+":"); return "Function";};
		System.out.println(function.apply("Function"));
		
		//Predicate<T> -T作为输入，返回的boolean值作为输出  
		Predicate<String> pre = (x) -> {System.out.print(x+":"); return true;};
		System.out.println(pre.apply("Predicate"));
		
		//Consumer<T> - T作为输入，执行某种动作但没有返回值
		Consumer<String> con = (x) -> System.out.println(x);
		con.accept("Consumer");
		
		//Supplier<T> - 没有任何输入，返回T
		Supplier<String> sup = () -> {return "hello Supplier";};
		System.out.println(sup.get());
		
		BinaryOperator<String> bina = (x,y) ->{System.out.print(x+" "+y);return "BinaryOperator";};  
        System.out.println("  "+bina.apply("hello ","world"));  
	}
}
