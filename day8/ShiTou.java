package day8;
import java.util.Scanner;
import java.util.Random;
/**
 * 猜拳游戏
 * @author 钱富根
 *
 */
public class ShiTou {
	public static void main(String[] args) {
		//游戏界面
		System.out.println("*************猜拳游戏v1.0***************");
		System.out.println("请输入您的姓名：");
		Scanner input = new Scanner(System.in);
		String name = input.next();							//玩家名字
		String[] advers = {"刘备","关羽","张飞"};				//对手集合
		String[] options = {"石头","剪刀","布"};				//操作集合
		System.out.println("请选择一下对手进行PK:");
		for(int i=0;i<advers.length;i++) {
			System.out.println(i+"."+advers[i]);
		}
		int adverNumber = input.nextInt();						//选择对手的编号
		String adversName = advers[adverNumber];				//对手姓名
		//打印对手选项
		System.out.println("***************PK*******************");
		System.out.println("\t"+name+"\tVS\t"+advers[adverNumber]);
		for(int i=0;i<options.length;i++) {
			System.out.println(i+"."+options[i]);
		}
		//开始猜拳
		System.out.println("请输入对应选项进行猜拳");
		System.out.println("********************************");
		Random rand = new Random();		
		String answer = "y";										//继续游戏还是退出的选择
		int yourScore = 0;											//玩家得分
		int adversScore = 0;										//对手得分
		while(!answer.equalsIgnoreCase("n")) {
			System.out.println("出什么(0.石头 1.剪刀 2.布)：");
			int optionsNo = input.nextInt();						//选择的操作编号
			System.out.println("你出的是："+options[optionsNo]);
			int adversNo = rand.nextInt(options.length);		//随机产生的对手操作编号
			System.out.println(adversName+"出的是："+options[adversNo]);
			//判断输赢
			if((optionsNo ==0 && adversNo ==1) || (optionsNo ==1 && adversNo ==2)|| (optionsNo ==2 && adversNo ==0) ) {
				System.out.println("恭喜你 ，你赢了！");				//3种获胜情况：1.石头对剪刀；2.剪刀对布；3.布对石头
				yourScore++;
			}else if(optionsNo == adversNo) {
				System.out.println("真巧，平局！");
			}else {
				System.out.println("可惜呀，你输了！");
				adversScore++;
			}
			System.out.println("是否继续？（Y/N）");
			answer = input.next();
		}
		//游戏结束，统计总分
		System.out.println("********************************");
		System.out.println("你的得分是："+yourScore+"\t"+adversName+"的得分是："+adversScore);
		if(yourScore > adversScore) {
			System.out.println("恭喜你，你赢的了本次比赛");
		}else if(yourScore < adversScore) {
			System.out.println("惜败呀！");
		}else {
			System.out.println("本次比赛，双方势均力敌，不分高下！");
		}
		System.out.println("下次再战！！！");
	}
}
