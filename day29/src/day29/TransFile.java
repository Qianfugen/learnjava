package day29;

import java.io.*;

public class TransFile {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		File oldFile = new File("src/test.txt");
		File newFile = new File("src/testCopy.txt");

		try {
			fis = new FileInputStream(oldFile);
			fos = new FileOutputStream(newFile);
			isr = new InputStreamReader(fis, "UTF-8");
			osw = new OutputStreamWriter(fos, "GBK");
			char[] cs = new char[1024];
			int length = 0;
			while ((length = isr.read(cs)) != -1) {
				osw.write(cs);
			}
			osw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (isr != null) {
					isr.close();
				}
				if (osw != null) {
					osw.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

}
