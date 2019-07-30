package string;

public class StringDemo {
	public static void main(String[] args) {
		// 拼接字符串 public StringBuffer append(String s)
		StringBuffer sBuffer = new StringBuffer("我");
		sBuffer.append("爱");
		sBuffer.append("我的");
		sBuffer.append("祖国!");
		System.out.println(sBuffer);

		// 字符串倒序
		StringBuffer str = new StringBuffer();
		str.append("我爱你");
		System.out.println("倒序前 :" + str);
		System.out.println("倒序后 :" + str.reverse());

		// 删除字符 public delete(int start, int end)
		sBuffer.delete(2, 4);
		System.out.println(sBuffer);

		// 插入字符
		sBuffer.insert(2, "伟大的");
		System.out.println(sBuffer);

		// 替换字符 replace(int start, int end, String str)
		sBuffer.replace(2, 4, "美丽");
		System.out.println(sBuffer);
	}
}
