package review;

import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		OutputStream output=new FileOutputStream("src/review/test.txt");
		try {
			String s="123";
			output.write(s.getBytes("utf-8"));
		}finally {
			output.close();
		}
	}
}
