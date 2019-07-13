import java.util.Scanner;

public class Erwei {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] arr = new int[3][5];
		//已知有3个班级各5名学员
		
		
		
		for(int i=1;i<=3;i++) {
			System.out.println("*************第"+i+"个班*************");
			for(int j=0;j<5;j++) {
				System.out.print("请输入第"+(j+1)+"个学生的成绩：");
				double score = input.nextInt();
				arr[i-1][j] =(int)score;
			}
		}
	}
}

