package com.test.jdk.demo.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ��FileInputStream��ȡ�ļ���ʹ��FileOutputStreamд���ļ�
 * @author zxm
 *
 */
public class TestFileOutputStream {
	public static void main(String[] args) {
		int i=0;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(args[0]);
			fos = new FileOutputStream(args[1]);
			
			do{
				i = fis.read();
				if(i!=-1) fos.write(i);
			}while(i!=-1);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(fos!=null) fos.close();//������try-catch��ȷ�����ܹر�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
