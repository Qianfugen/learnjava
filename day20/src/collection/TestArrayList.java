package collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class TestArrayList {
	public static void main(String[] args) {
		//定义集合
		ArrayList names=new ArrayList();
		
		//向集合中添加成员
		names.add("pipixia");
		names.add(1001);
		names.add(false);
		names.add(90.5);
		names.add(1,new Date());
		
		//for循环遍历
		System.out.println("for循环遍历集合成员为:");
		for(int i=0;i<names.size();i++) {
			System.out.print(names.get(i)+"\t");
		}
		System.out.println();
		
		//修改集合成员
		names.set(1, "2019-07-26");
		
		//删除成员
		names.remove(1);
		Object oo=1001;//直接删除,默认为下标,先进行类型转换
		names.remove(oo);
		
		//foreach循环遍历
		System.out.println("foreach循环遍历集合成员为:");
		for(Object o:names) {
			System.out.print(o+"\t");
		}
		System.out.println();
		
		//查询集合成员
		if(names.contains(1001)) {
			System.out.println("存在");
		}else {
			System.out.println("不存在");
		}
		
		//使用Iterator进行遍历
		Iterator its=names.iterator();
		System.out.println("使用Iterator进行遍历");
		while(its.hasNext()) {
			System.out.print(its.next()+"\t");
		}
	}
}
