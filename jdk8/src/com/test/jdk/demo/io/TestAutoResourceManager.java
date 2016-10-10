package com.test.jdk.demo.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * �Զ���Դ������չ��try���
 * ���ļ�������Ҫ��ʱ�򣬿����Զ��ر��ļ���
 * ֻ����Щʵ����AutoCloseable�ӿڵ���Դ������ʹ�ô���Դ��try��䡣
 * AutoCloseable�ӿ���java.lang���ж���ģ��ýӿڶ�����close()������
 * java.io���е�Closeable�ӿڼ̳���AutoCloseable�ӿڣ����е����඼ʵ���������ӿڡ�
 * ��ʹ������ʱ�����ʹ�ô���Դ��try��䡣
 * @author zxm
 *
 */
public class TestAutoResourceManager {
	public static void main(String[] args) {
		int i = 0;
		
		//��try��������ʱ�����Զ��ͷ���Դ����˲���Ҫ��ʾ�ĵ���close()�������ر��ļ�
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
