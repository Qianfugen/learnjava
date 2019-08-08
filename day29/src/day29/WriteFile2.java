package day29;

import java.io.*;
import java.util.Scanner;

public class WriteFile2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		File f = new File("src/test2.txt");
		FileWriter fw = null;

		try {
			fw = new FileWriter(f);
			while (true) {
				System.out.println("请输入想要保存的语句:(输入'OK'结束)");
				String str = input.nextLine();
				if (str.equalsIgnoreCase("OK")) {
					break;
				}
				fw.write(str);
				fw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
					System.out.println("保存成功!");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
