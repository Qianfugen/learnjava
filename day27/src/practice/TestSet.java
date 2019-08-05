package practice;

import java.util.*;

public class TestSet {
	public static void main(String[] args) {
		/**
		 * 1.长度可变
		 * 2.无序无下标
		 * 3.不重复
		 * HashSet:按照元素的内存地址排序
		 * TreeSet:按照自定义排列规则
		 */
		System.out.println("-------------------HashSet--------------------");
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(1);
		hs.add(1);
		for(int i:hs) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		System.out.println("-------------------TreeSet-----------------------");
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(1);
		ts.add(1);
		for(int i:ts) {
			System.out.print(i+"\t");
		}
	}
}
