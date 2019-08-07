package homework;

import java.io.*;

public class FileTranslate {

	public static void main(String[] args) {
		try {
			// 创建一个FileReader对象
			FileReader fr = new FileReader("baby.txt");
			// 创建一个BufferedReader对象
			BufferedReader br = new BufferedReader(fr);
			// 读取一行数据
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println("读取失败!");
			e.printStackTrace();
		}

	}

}
