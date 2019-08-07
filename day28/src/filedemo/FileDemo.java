package filedemo;

import java.io.*;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Users\\root\\eclipse-workspace\\review\\src\\pipixia.txt";
		File f = new File(filePath);
		if (!f.exists()) {
			f.createNewFile();
		}

		// 写入操作
		Writer fw = new FileWriter(filePath);
		fw.write("I love you!");
		fw.close();

		// 读取操作
		FileReader fr = new FileReader(filePath);
		int length = fr.read();
		while (length != -1) {
			System.out.print((char) (length));
			length = fr.read();
		}

		fr.close();

	}
}
