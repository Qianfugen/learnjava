package review;

public class StringDemo {

	public static void main(String[] args) {
		String str = "abcdefg";
		String str2 = "aCda";
		// 返回char指定索引处的值
		System.out.println(str.charAt(2));
		// 返回指定索引处的字符
		System.out.println(str.codePointAt(2));
		// 返回定索引之前的字符
		System.out.println(str.codePointBefore(2));
		// 返回指定索引范围内的字符
		System.out.println(str.codePointCount(1, 3));

		// 按字典顺序比较两个字符串,基于字符串每个字符的Unicode值
		System.out.println(str.compareTo(str2));
		// 忽略大小写
		System.out.println(str.compareToIgnoreCase(str2));

		// 连接字符串,等于+号
		System.out.println(str.concat(str2));

		// 当且 仅当字符串包含字符,才返回true
		System.out.println(str.contains("a"));

		// 将此字符串与指定的CharSequence进行CharSequence
		System.out.println(str.contentEquals(str2));

		// 字符串比较
		System.out.println(str.equals(str2));

		// 忽略大小写进行比较
		System.out.println(str.equalsIgnoreCase("Abcdefg"));

		// 将字符串编码为字符序列
		System.out.println(str.getBytes());

		// 返回指定字符第一次出现在字符串中的索引
		System.out.println(str.indexOf('c'));

		// 返回指定字符第一次出现在字符串中的索引,从指定的索引开始
		System.out.println(str.indexOf('c', 2));

		// 返回指定字符的最后一次出现的字符串中的索引
		System.out.println(str2.lastIndexOf('a'));

		// 返回字符串长度
		System.out.println(str.length());

		// 替换字符
		System.out.println(str2.replace('a', 'A'));
		System.out.println(str2.replace("aC", "BB"));

		// 将字符串分割
		String str3 = "aj adj adjadk d";
		String[] strList = str3.split(" ");
		for (String s : strList) {
			System.out.print(s + "\t");
		}
		System.out.println();

		// 分割字符串,限定最大分组数,达到最大分组后,后面的都挤在最后一组
		strList = str3.split(" ", 3);
		for (String s : strList) {
			System.out.print(s + "\t");
		}
		System.out.println();

		// 将字符串转为数组
		System.out.println(str3.toCharArray());

		// 改为大写
		System.out.println(str.toUpperCase());

		// 改为小写
		System.out.println(str.toLowerCase());

		// 删除前导和尾随空格
		str3 = " daj jajd  ";
		System.out.println(str3.trim());

		// 删除空格
		System.out.println(str3.strip());

		// 返回char参数的字符串char形式
		System.out.println(str.valueOf("adfa"));

		// 截取后缀名
		str3 = "huihui.txt";
		System.out.println(str3.substring(str3.indexOf(".") + 1));
	}

}
