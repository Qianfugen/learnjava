package cn.zlxy;
import java.util.Scanner;

public class CalSalary {
	public static void main(String[] args){
		int baseSalary;
		double ga;
		double hra;
		double salary;
		
		System.out.println("请输入您的基本工资：");
		Scanner sc = new Scanner(System.in);
		baseSalary = sc.nextInt();			//基本工资
		ga = baseSalary*40/100;				//物价津贴
		hra = baseSalary*25/100;			//房租津贴
		salary = baseSalary + ga + hra;		//薪水
		sc.close();
		
		System.out.println("您的工资细目：");
		System.out.println("基本工资："+baseSalary);
		System.out.println("物价津贴："+ga);
		System.out.println("房租津贴："+hra);
		System.out.println("您的薪水："+salary);
	}
}
