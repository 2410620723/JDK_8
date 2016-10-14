package com.test.jdk.demo.other;

public class TestSwitch {
	public static void main(String[] args) {
		String s = "hello";
//		long l = 10L;
		switch(s){
			case "hello":
				System.out.println("hello");
				break;
			case "world":
				System.out.println("world");
				break;
			default:
				System.out.println("other");
				break;
		}
		/*switch (l) {
		case 1:
			System.out.println(1);
			break;

		default:
			break;
		}*/
	}
	public boolean sh(){
		int x = 1;
		return x==1?true:false;
	}
}
