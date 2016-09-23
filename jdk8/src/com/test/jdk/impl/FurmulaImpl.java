package com.test.jdk.impl;

import com.test.jdk.interfaces.Furmula;

public class FurmulaImpl {

	public static void main(String[] args) {
		/*Furmula furmula = new Furmula() {
			
			@Override
			public double calculator(int a) {
				return a*100;
			}
		};*/
		Furmula furmula = (a) -> a*100;
		System.out.println("calculator:" + furmula.calculator(10));;
		System.out.println("sqrt:" + furmula.sqrt(100));;
		System.out.println(Furmula.staticMethod());
	}

}
