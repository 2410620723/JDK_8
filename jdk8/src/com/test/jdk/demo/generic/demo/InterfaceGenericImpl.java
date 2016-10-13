package com.test.jdk.demo.generic.demo;

public class InterfaceGenericImpl<T extends Comparable<T>> implements InterfaceGeneric<T> {
	T[] vals;
	
	public InterfaceGenericImpl(T[] o){
		vals = o;
	}
	
	@Override
	public T min() {
		T v = vals[0];
		for(int i=0;i<vals.length;i++){
			if(vals[i].compareTo(v)<0) v=vals[i];
		}
		return v;
	}

	@Override
	public T max() {
		T v = vals[0];
		for(int i=0;i<vals.length;i++){
			if(vals[i].compareTo(v)>0) v=vals[i];
		}
		return v;
	}

}
