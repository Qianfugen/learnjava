package day11;

import java.util.Scanner;

public class Caculate {
	public int cacuArea(int length, int width) {
		return length*width;
	}
	
	public int cacuPerimeter(int length, int width) {
		return 2*length*width;
	}
	
	public void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入长度：");
		int length = input.nextInt();
		System.out.println("请输入宽度：");
		int width = input.nextInt();
		
		Caculate juxing = new Caculate();
		juxing.cacuArea(length, width);
		juxing.cacuPerimeter(length, width);
	}
	
}
