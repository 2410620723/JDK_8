package com.test.jdk.demo.generic.demo;
/**
 * ÓÐ½çÍ¨Åä·û
 * @author zxm
 *
 * @param <T>
 */
public class BoundedWildcardGeneric<T extends BasicClass> {
	T[] coords;
	public BoundedWildcardGeneric(T[] o){
		coords = o;
	}
	
	public void showXY(BoundedWildcardGeneric<?> c){
		System.out.println("X Y coordinate is:");
		for(int i=0;i<coords.length;i++){
			System.out.println(c.coords[i].x+", "+c.coords[i].y);
		}
	}
	
	public void showXYZ(BoundedWildcardGeneric<? extends ThreeDimensional> c){
		System.out.println("X Y coordinate is:");
		for(int i=0;i<coords.length;i++){
			System.out.println(c.coords[i].x+", "+c.coords[i].y+", "+c.coords[i].z);
		}
	}
}
