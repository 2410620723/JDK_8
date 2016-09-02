package com.test.jdk.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Ordering;
/**
 * guava����
 * @author zxm
 *
 */
public class OrderingDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
	    numbers.add(new Integer(5));
	    numbers.add(new Integer(2));
	    numbers.add(new Integer(15));
	    numbers.add(new Integer(51));
	    numbers.add(new Integer(53));
	    numbers.add(new Integer(35));
	    numbers.add(new Integer(45));
	    numbers.add(new Integer(32));
	    numbers.add(new Integer(43));
	    numbers.add(new Integer(16));
	    System.out.println("input numbers:"+numbers);
	    
	    Ordering ordering = Ordering.natural();
	    
	    //��numbers���Ͻ�������
	    Collections.sort(numbers, ordering);
	    System.out.println("sorted numbers:"+numbers);
	    
	    //�жϼ����Ƿ�������
	    System.out.println("numbers is ordered?:"+ordering.isOrdered(numbers));
	    
	    //��ȡnumbers���ϵ����ֵ����Сֵ
	    System.out.println("numbers's max:"+ordering.max(numbers));
	    System.out.println("numbers's min:"+ordering.min(numbers));
	    
	    //��������
	    Collections.sort(numbers,ordering.reverse());
	    System.out.println("numbers reverse:"+numbers);
	    
	    //numbers�в���null
	    numbers.add(null);
	    System.out.println("null is added to numbers:"+numbers);
	    
	    //��null������λ
	    Collections.sort(numbers, ordering.nullsFirst());
	    System.out.println("null first sorted:"+numbers);
	    
	    List<String> names = new ArrayList<String>();
	    names.add("Ram");
	    names.add("Shyam");
	    names.add("Mohan");
	    names.add("Sohan");
	    names.add("Ramesh");
	    names.add("Suresh");
	    names.add("Naresh");
	    names.add("Mahesh");
	    names.add(null);
	    names.add("Vikas");
	    names.add("Deepak");
	    
	    System.out.println("names:"+names);
	    
	    Collections.sort(names, ordering.nullsFirst().reverse());
	    System.out.println("names sorted:"+names);
	}
}
