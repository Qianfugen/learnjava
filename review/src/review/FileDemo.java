package review;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		// 创建和删除文件
		FileDemo fd = new FileDemo();
		File f = new File("C:\\Users\\root\\eclipse-workspace\\review\\src\\test.txt");
		fd.create(f);
		fd.delete(f);

	}

	// 创建文件的方法
	public void create(File file) throws IOException {
		if (!file.exists()) {
			file.createNewFile();
		}
	}

	// 删除文件的方法
	public void delete(File file) throws IOException {
		if (file.exists()) {
			file.delete();
		}
	}
}
