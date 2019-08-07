package homework;

/**
 * 列出所有文件和文件夹
 */
import java.io.*;

public class ListDir {

	public static void main(String[] args) {
		ListDir ld = new ListDir();
		ld.listDir("src");
	}

	public void listDir(String s) {
		File f = new File(s);
		String temp = f.getAbsolutePath();
		// 判断是否为文件夹
		if (f.isDirectory()) {
			String[] dirs = f.list();
			for (String file : dirs) {
				// 打印目录
				System.out.println(file);
				s = s + "/" + file;
				listDir(s);
				s = temp;
			}
		}
	}
}
