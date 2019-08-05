package homework;

import java.util.*;

/**
 * String str="kljsalkdjsaldjsaljdalsjduyiuyhi" 统计该字符串中每个字符出现的次数
 * 
 * @author 钱富根
 * @version 1.0 2019年8月5日
 */

public class TestString {

	public static void main(String[] args) {
		String str = "kljsalkdjsaldjsaljdalsjduyiuyhi";

		System.out.println("------------使用set方法---------------");
		TreeSet<Integer> strSet = new TreeSet<Integer>();
		// 把字符串里的字符填入set集合
		for (int i = 0; i < str.length(); i++) {
			strSet.add((int) str.charAt(i));
		}
		// 遍历set,把字符串的字符一一与set元素比较,重复+1
		for (int c : strSet) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (c == str.charAt(i)) {
					count++;
				}
			}
			System.out.printf("%c: %d\n", c, count);
		}

		System.out.println("----------------使用数组方法--------------");
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		int count = 1;
		for (int i = 1; i < ch.length; i++) {
			if (ch[i] == ch[i - 1]) {
				count++;
			} else {
				System.out.println(ch[i - 1] + ":" + count);
				count = 1;
			}
		}
		System.out.println(ch[ch.length - 1] + ":" + count);

		System.out.println("---------------使用Map方法-----------------");
		HashMap<Character, Integer> strMap = new HashMap<Character, Integer>();
		int counts = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			char c = str.charAt(i);
			if (strMap.containsKey(c)) {
				continue;
			}
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(j) == c) {
					counts++;
				}
				strMap.put(c, counts);
			}
			counts = 1;
		}
		Set<Character> keys = strMap.keySet();
		for (Character c : keys) {
			System.out.println(c + ":" + strMap.get(c));
		}

		System.out.println("-------------------使用Map改进方法----------------");
		HashMap<Character, Integer> strMap2 = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			strMap2.put(c, strMap2.containsKey(c) ? strMap2.get(c) + 1 : 1);
		}
		Set<Character> keySet = strMap2.keySet();
		for (Character c : keySet) {
			System.out.println(c + ":" + strMap2.get(c));
		}

		System.out.println("------------------使用String方法-----------------");
		String s = "";
		for (int i = 0; i < str.length() - 1; i++) {
			int counts2 = 1;
			char c = str.charAt(i);
			if (s.indexOf(c) >= 0) {
				continue;
			}
			s += c;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(j) == c) {
					counts2++;
				}
			}
			System.out.println(c + ":" + counts2);
		}

	}

}
