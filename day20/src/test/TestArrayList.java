package test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> strList=new ArrayList<String>();
		strList.add("狗");
		strList.add("猫");
		//for循环遍历
		for(int i=0;i<strList.size();i++) {
			System.out.println(strList.get(i));
		}
		
		//foreach循环
		for(String str:strList) {
			System.out.println(str);
		}
		
		//迭代打印
		Iterator it=strList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
