package com.test.jdk.demo.other;

import org.junit.Test;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
/**
 * 测试静态导入
 * 在import后面加上static
 * @author zxm
 *
 */
public class TestStaticImport {
	@Test
	public void noStaticImport(){
		double side1 = 3.0,side2 = 4.0;
		double side3;
		side3 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
		System.out.println("直角三角形的斜边长为："+side3);
	}
	
	@Test
	public void staticImport(){
		double side1 = 3.0,side2 = 4.0;
		double side3;
		side3 = sqrt(pow(side1, 2) + pow(side2, 2));
		System.out.println("直角三角形的斜边长为："+side3);
	}
}
