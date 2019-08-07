package review;

public class StringBufferDemo {

	public static void main(String[] args) {
		String str = "";
		StringBuffer sb = new StringBuffer("");

		// 测试str拼接字符串的效率
		long starttime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			str += i;
		}
		long endtime = System.currentTimeMillis();
		System.out.println("String共耗时:" + (endtime - starttime));

		// 测试StringBuffer拼接字符串的效率
		starttime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			sb.append(i);
		}
		endtime = System.currentTimeMillis();
		System.out.println("StringBuffer共耗时:" + (endtime - starttime));

	}

}
