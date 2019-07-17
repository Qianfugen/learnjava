package day12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test2 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//1.取首位元素
		System.out.println("the first:"+list.getFirst());
		System.out.println("the last:"+list.getLast());
		
		//2.获取列表元素
		for(String str:list) {
			System.out.print(str+" ");
		}
		
		//3.打印
		System.out.println(list);

		//4.删除元素
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		//下标删除
		list.remove(1);
		System.out.println(list);
		
		/*
		//5.转为ArrayList
		ArrayList<String> arr = new ArrayList<String>(list);
		for(String s:arr) {
			System.out.println("s = "+s);
		}
		*/
		//6.清空所有元素
		list.clear();
		System.out.println(list);
		
		//7.根据下标添加元素
		list.add(0,"2");
		list.add(1,"4");
		//添加到末尾
		list.add("6");
		list.add("8");
		list.add(4, "10");
		System.out.println(list);
		
		//8.根据范围删除列表元素(删除后三位)
		list.subList(2, 5).clear();
		System.out.println(list);
		list.add(2,"6");
		list.add(3,"8");
		list.add(4,"10");
		System.out.println(list);
		
		//9.删除指定元素
		list.remove("8");
		System.out.println(list);
		
		//10.转为数组
		String[] my = list.toArray(new String[0]);
		for(String a:my) {
			System.out.print(a+" ");
		}

		
		//11.查找元素位置
		list.add(3,"8");
		list.add(3,"8");
		System.out.println(list);
		//首个"8"
		System.out.println(list.indexOf("8"));
		//末尾的"8"
		System.out.println(list.lastIndexOf("8"));
		//只删除一个"8"
		list.remove("8");
		System.out.println(list);
		
		//12.替换元素 8-->12
		list.set(3, "12");
		System.out.println(list);
		//12-->8
		list.set(3, "8");
		System.out.println(list);
		
	}
}
