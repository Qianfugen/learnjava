package practice;

import java.io.*;

public abstract class ObjectIOUtil {
	// 创建源文件
	private static File f = new File("src/heihei.txt");

	// 把对象写入文件
	public static void objectToFile(Object obj) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			// 把流输入到文件
			fos = new FileOutputStream(f);
			// 把对象转为流
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	// 把文件转为对象
	public static Object fileToObject() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object obj = null;
		try {
			// 把文件转到流
			fis = new FileInputStream(f);
			// 把流转为对象
			ois = new ObjectInputStream(fis);
			// 获取对象
			obj = ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return obj;
	}
}
