package homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestRead {

	public static void main(String[] args) {
		String s = "";
		try {
			// 1.创建文件流对象
			Reader fr = new FileReader("pipixia.txt");

			// 2.创建数组，用来存放每次读取的内容
			char[] c = new char[1024];

			// 3.循环读取并处理内容
			int length = fr.read(c);

			while (length != -1) {
				s += String.valueOf(c);
				length = fr.read(c);
			}

			// 处理空格问题
			s = s.trim();
			// 打印内容
			System.out.println(s);
			// 4.关闭文件流
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
