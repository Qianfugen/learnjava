package homework;

import java.io.*;

public class TestFile {
	public static void main(String[] args) {
		String filePath = "src/homework/pipixia.txt";
		// 创建文件
		File newFile = new File(filePath);
		if (!newFile.exists()) {
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				System.out.println("创建文件不成功!");
				e.printStackTrace();
			}
		}

		// 写入文件内容

		try {
			String str = "Don't move!";
			byte[] words = str.getBytes();
			// 创建流对象,以追加方式写入文件
			FileOutputStream fos = new FileOutputStream(filePath);
			fos.write(words);
			System.out.println("文件写入成功!");
			// 关闭流
			fos.close();
		} catch (IOException e) {
			System.out.println("文件写入失败!");
			e.printStackTrace();
		}

		// 读取文件内容
		try {
			// 创建流对象
			FileInputStream fis = new FileInputStream(filePath);
			// 循环遍历方式读取文件
			int c;
			while ((c = fis.read()) != -1) {
				System.out.print((char) c);
			}
			fis.close();

		} catch (IOException e) {
			System.out.println("文件读取失败!");
			e.printStackTrace();
		}

	}
}
