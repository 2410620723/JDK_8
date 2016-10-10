package com.test.jdk.demo.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 自动资源管理扩展的try语句
 * 当文件不再需要的时候，可以自动关闭文件。
 * 只有那些实现了AutoCloseable接口的资源，才能使用带资源的try语句。
 * AutoCloseable接口有java.lang包中定义的，该接口定义了close()方法。
 * java.io包中的Closeable接口继承自AutoCloseable接口，所有的流类都实现这两个接口。
 * 当使用流的时候可以使用带资源的try语句。
 * @author zxm
 *
 */
public class TestAutoResourceManager {
	public static void main(String[] args) {
		int i = 0;
		
		//当try代码块结束时，会自动释放资源，因此不需要显示的调用close()方法来关闭文件
		try(FileInputStream fis = new FileInputStream(args[0])){
			do{
				i = fis.read();
				if(i!=-1) System.out.print((char)i);
			}while(i!=-1);
			System.out.println();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream(args[0]);
				FileOutputStream fos = new FileOutputStream(args[1])){
			do {
				i = fis.read();
				if (i != -1)
					fos.write(i);
			} while (i!=-1);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
