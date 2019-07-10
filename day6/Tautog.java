package day6;

public class Tautog {
	public static void main(String[] args) {
		int a[][] = new int[][] {{4,3},{1,2}};
		System.out.println("数组元素为：");
		for(int x[]: a) {
			for (int e : x) {
				if(e == x.length) {
					System.out.print(e);
				}else {
					System.out.print(e+"、");
				}
			}
		}
	}
}
