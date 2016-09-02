package com.test.jdk.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
/**
 * 集合
 * @author zxm
 *
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		List<String> stringCollection = new ArrayList<String>();
		stringCollection.add("aaa2");
		stringCollection.add("aaa1");
		stringCollection.add("bbb1");
		
		//将所有流对象中的元素进行过滤
//		stringCollection.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);
		
		//创建一个流对象排序的视图，而不会改变原来集合中元素的顺序。原来string集合中的元素顺序是没有改变的。 
//		stringCollection.stream().sorted().forEach(System.out::println);
		
		/*map是一个对于流对象的中间操作，通过给定的方法，它能够把流对象中的每一个元素对应到另外一个对象上。
		 *下面的例子就演示了如何把每个string都转换成大写的string. 不但如此，你还可以把每一种对象映射成为其他类型。
		 *对于带泛型结果的流对象，具体的类型还要由传递给map的泛型方法来决定。
		*/
//		stringCollection.stream().map(String::toUpperCase).sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);
		
		//任意一个元素是以a开头的
		boolean anyStartWithA = stringCollection.stream().anyMatch((s) -> s.startsWith("a"));
		System.out.println(anyStartWithA);
		
		//所有的元素都是以a开头的
		boolean allStartWithA = stringCollection.stream().allMatch((s) -> s.startsWith("a"));
		System.out.println(allStartWithA);
		
		//没有元素是以c开头的
		boolean noneStartWithA = stringCollection.stream().noneMatch((s) -> s.startsWith("c"));
		System.out.println(noneStartWithA);
		
		//Count是一个终结操作，它的作用是返回一个数值，用来标识当前流对象中包含的元素数量。 
		long countStartWithA = stringCollection.stream().filter((s) -> s!=null).count();
		System.out.println(countStartWithA);
		
		//使用stream将list集合进行排序，然后再转换成list集合
		List<String> stringList = stringCollection.stream().sorted().collect(Collectors.toList());
		System.out.println(stringList);
		
		//该操作是一个终结操作，它能够通过某一个方法，对元素进行削减操作。该操作的结果会放在一个Optional变量里返回。 
		Optional<String> reduces = stringCollection.stream().reduce((s1,s2) -> s1+"#"+s2);
		reduces.ifPresent(System.out::println);
		
	}
}
