package com.test.jdk.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream 读取文件
 * @author zxm
 *
 */
public class TestFileInputStream {
	public static void main(String[] args) {
		int i=0;
		FileInputStream fis = null;
		if(args.length!=-1){
			System.out.println("usage:TestFileInputStream filename");
		}
		try {
			fis = new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("cannot open the file");
			e.printStackTrace();
			return;
		}
		/*try {
			do{
				i = fis.read();
				if(i!=-1) System.out.println((char)i);
			}while(i!=-1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		try {
			do{
				i = fis.read();
				if(i!=-1) System.out.println((char)i);
			}while(i!=-1);
		} catch (IOException e) {
			e.printStackTrace();
		}finally { //即使程序异常终止，也会执行该段代码关闭文件流
			try {
				if(fis!=null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
