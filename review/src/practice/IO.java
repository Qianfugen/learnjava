package practice;

import java.io.*;

public class IO {

	public static void main(String[] args) throws FileNotFoundException {
		//键盘输入流
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		BufferedReader br1=new BufferedReader(new FileReader(""));
		try {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
