package arraylist;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		System.out.printf("Before add:arrayList.size()=%d\n",arrayList.size());
		
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(5);
		arrayList.add(7);
		arrayList.add(9);
		System.out.printf("After add:arrayList.size=%d\n",arrayList.size());
		
		System.out.println("Printing elements of arrayList");
		//三种遍历方式打印元素
		//第一种：通过迭代器遍历
		System.out.println("迭代器遍历");
		Iterator<Integer> it=arrayList.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		//第二种：通过索引值遍历
		System.out.println("通过索引遍历");
		for(int i=0;i<arrayList.size();i++) {
			System.out.print(arrayList.get(i)+" ");
		}
		System.out.println();
		
		//第三种：for循环遍历
		System.out.println("for循环遍历");
		for(int n:arrayList) {
			System.out.print(n+" ");
		}
		
		//toArray用法
		//第一种方式(最常用)
		Integer[] integer=arrayList.toArray(new Integer[0]);
		
		//第二种方式
		Integer[] integer1=new Integer[arrayList.size()];
		arrayList.toArray(integer1);
		System.out.println();
		
		//在指定位置添加元素
		arrayList.add(2, 2);
		//删除指定位置上的元素
		arrayList.remove(2);
		//删除指定元素
		arrayList.remove((Object)3);
		//判断arrayList是否包含5
		System.out.println("ArrayList contains 5 is:"+arrayList.contains(3));
		
		//清空ArrayList
		arrayList.clear();
		//判断ArrayList是否为空
		System.out.println("ArrayList is empty:"+arrayList.isEmpty());
	}
}
