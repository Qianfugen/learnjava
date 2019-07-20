package day15;

import java.util.Scanner;

public class FingerGuess {
	//创建实例对象
	Operator op = new Operator();
	Scanner input = new Scanner(System.in);
	
	String player;//玩家姓名
	String figure;//对手姓名
	
	public static void main(String[] args) {
		FingerGuess fg=new FingerGuess();
		fg.showMenu();
		fg.startGame();
	}
	
	/**
	 * 显示游戏列表
	 */
	public void showMenu() {
		//游戏界面
		System.out.println("*************猜拳游戏v1.0***************");
		System.out.println("请输入玩家姓名：");
		player= input.next();	//获取玩家名字
		op.showFigures();		//打印对手
		System.out.println("请选择一下对手进行PK(输入序号):");
		figure=op.getName(input.nextInt());		//获取对手姓名
		System.out.println("**************游戏开始*******************");
		System.out.println(player+"\t\tPK\t\t"+figure);//显示开始游戏，进行猜拳游戏
	}
	
	/**
	 * 开始游戏
	 */

	public void startGame() {
		int select=0;	//选择
		int counts=1;	//局数
		do {
			System.out.println("*************第  "+counts+"  局**************");
			System.out.println("请输入您的操作(1/2/3/0)");
			op.showOptions();
			System.out.println("0.退出");
			select=input.nextInt();
			System.out.println(op.pk(select));
			counts++;	//每万一局，累加一次
		}while(select!=0);
	}
}
