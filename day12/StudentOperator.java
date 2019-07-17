package day12;

import java.util.LinkedList;

import day12.Student;
/**
 * 编写学生操作类StudentOperator，实现对班级多名学生信息的添加和列表显示功能。
 * @author root
 *
 */
public class StudentOperator {
	//定义属性
	String name;
	boolean sex;
	int age;
	double score;
	
	//定义列表
	LinkedList<String> nameList = new LinkedList<String>();
	LinkedList<Boolean> sexList = new LinkedList<Boolean>();
	LinkedList<Integer> ageList = new LinkedList<Integer>();
	LinkedList<Double> scoreList = new LinkedList<Double>();
	
	/**
	 * 学生信息的添加功能
	 */
	public void add(String name, boolean sex, int age, double score) {
		nameList.add(name);
		sexList.add(sex);
		ageList.add(age);
		scoreList.add(score);
	}
	
	/**
	 * 学生信息的列表显示功能
	 */
	public void show() {
		System.out.printf("%15s%10s%15s%15s","姓名","性别","年龄","成绩");
		for(int i=0;i<nameList.size()-1;i++) {
			System.out.printf("%15s",nameList.get(i));
			String sex=sexList.get(i)?"男":"女";
			System.out.printf("%10s",sex);
			System.out.printf("%15d",ageList.get(i));
			System.out.printf("%15.2f\n",scoreList.get(i));
		}
	}
}
