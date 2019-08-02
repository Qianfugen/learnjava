package homework;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestWrite {

	public static void main(String[] args) {
		try {
			// 1.定义输出流对象
			Writer fw = new FileWriter("pipixia.txt");

			// 2.将文件内容写入到文件中
			fw.write("What fuck!");

			// 3.关闭文件流
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
