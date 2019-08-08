package review;

import java.io.*;
import java.nio.charset.Charset;

public class IOstream {
	public static void main(String[] args) throws FileNotFoundException {
		// 写入文件
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("src/review/hello.txt");
			String data = "wocao,who are you?";
			byte[] by = data.getBytes(Charset.forName("utf-8"));
			fos.write(by);
			fos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		// 输出文件
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("src/review/hello.txt");
			byte[] buf = new byte[1024];
			int bytesRead=fis.read(buf);
			String data=new String(buf,0,bytesRead,"utf-8");
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
