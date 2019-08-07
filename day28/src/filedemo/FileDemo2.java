package filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) {
		File dir=new File("src/filedemo/test");
		if(!dir.exists()) {
			System.out.println(dir.mkdir());
		}
		
		File f=new File("src/filedemo/test/test.txt");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("捕获异常");
				e.printStackTrace();
			}
		}
	
	}
}
