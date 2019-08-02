package day25;

import java.io.FileReader;
import java.io.Reader;


public class FileOperator {
	public String readFile(String file) {
		String s = "";
		try {
			//创建文件流对象
			Reader fr = new FileReader(file);
			//创建数组
			char[] c = new char[10];
			//循环读取
			int length = fr.read();
			System.out.println(length);
			
			while (length != -1) {
				s += String.valueOf(c);
				s.trim();
				System.out.println(s.length());
				System.out.println(s);
				length = fr.read(c);
//				System.out.println(length);
			}
			//关闭文件
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
}
