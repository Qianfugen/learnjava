package review;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();

		// 将指定元素追加到此列表末尾
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(2);

		// 指定位置插入元素
		arr.add(2, 9);

		// 清空列表
		arr.clear();

		// 浅拷贝
		Set<Integer> arr2 = new HashSet<Integer>();
		arr2.add(1);
		arr2.add(2);
		arr2.add(4);
		arr2.add(3);
		arr2.add(5);
		arr.addAll(arr2);

		// 如果列表包含指定元素,返回true
		System.out.println(arr.contains(3));

		// 获取列表指定位置的元素
		System.out.println(arr.get(1));

		// 返回此列表中指定元素的第一次出现的索引,如不 包含,返回-1
		System.out.println(arr.indexOf(5));

		// 如果此列表不包含元素,返回true
//		arr.clear();
		System.out.println(arr.isEmpty());

		// 以正确的顺序返回该列表元素的迭代器
		Iterator its = arr.iterator();
		while (its.hasNext()) {
			System.out.print(its.next() + "\t");
		}
		System.out.println();

		// 指定位置打印
		its = arr.listIterator(3);
		while (its.hasNext()) {
			System.out.print(its.next() + "\t");
		}
		System.out.println();

		// 删除元素指定元素,第一个出现
		arr.remove((Object) 2);
		System.out.println();

		// 大小
		System.out.println(arr.size());

		// 打印
		for (int a : arr) {
			System.out.print(a + "\t");
		}
		System.out.println();

	}

}
