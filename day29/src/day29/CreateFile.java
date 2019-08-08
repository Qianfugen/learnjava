package day29;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File f = new File("src/test.txt");
		try {
			if (!f.exists()) {
				f.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
