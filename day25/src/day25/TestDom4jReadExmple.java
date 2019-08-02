package day25;

import java.util.HashMap;

public class TestDom4jReadExmple {

	public static void main(String[] args) {
		try {
			// 获取解析完后的解析信息
			HashMap<String, String> hashMap = null;
			Dom4jReadExmple drb = new Dom4jReadExmple();
			// 遍历整个XML文件
			hashMap = new HashMap<String, String>();
			// 获取当前工程的真是路径
			String n = System.getProperty("user.dir");
			// studentInfo.xml保存学生信息,放在src目录下
			drb.iterateWholeXML("src/studentInfo.xml", hashMap);
			for (int i = 0; i < hashMap.size(); i += 6) {
				int j = i / 6;
				System.out.print(hashMap.get("name" + j) + "\t");
				System.out.print(hashMap.get("student" + j) + "\t");
				System.out.print(hashMap.get("college" + j) + "\t");
				System.out.print(hashMap.get("college-leader" + j) + "\t");
				System.out.print(hashMap.get("telephone" + j) + "\t");
				System.out.print(hashMap.get("notes" + j) + "\t");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
