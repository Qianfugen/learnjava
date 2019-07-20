package fingerguess;

import java.util.Scanner;

public class FingerGuess {
	// 实例化对象
	Scanner input = new Scanner(System.in);
	FiguresList fglist = new FiguresList();
	Movement move = new Movement();

	// 玩家和对手姓名
	String figureName;
	String playerName;
	int select; // 选择

	// 玩家和对手积分
	int playerScore = 0;
	int figureScore = 0;
	int equalScore = 0;

	public static void main(String[] args) {
		// 创建测试对象
		FingerGuess ts = new FingerGuess();
		int counts = 1;// 局数
		ts.startGame();// 游戏菜单
		do {
			System.out.println("****************第           " + counts + "      局***************");
			ts.playGame();
			counts++;
		} while (true);
	}

	/**
	 * 打印菜单
	 */
	public void startGame() {
		System.out.println("****************猜拳游戏********************");
		System.out.println("请输入玩家姓名：");
		playerName = input.next();
		System.out.println("*****************选择英雄******************");
		System.out.println("请选择对手");
		fglist.showlist();// 打印对手列表
		select = input.nextInt();// 对手下标
		if (select != 0 && select != 1 && select != 2) {
			System.out.println("请输入正确选项：（0/1/2）");
			System.exit(0);
		} else {
			System.out.println("*******************PK********************");
			figureName = fglist.showFigure(select);
			System.out.println(playerName + "\t\tVS\t\t" + figureName);
		}
	}

	public void playGame() {
		System.out.println("游戏动作");
		move.showMovements();
		System.out.println("3.结束比赛");// 设置一个退出选项
		System.out.println("出什么？(0/1/2/3)");

		// 玩家选择动作
		select = input.nextInt();
		// 结束比赛赛
		if (select != 0 && select != 1 && select != 2) {
			// 打印最终成绩
			System.out.println("******************比赛最终结果*******************");
			System.out.println(playerName + "得分： " + playerScore + "\t" + figureName + "得分： " + figureScore + "\t平局："
					+ equalScore);

			// 判断输赢
			if (playerScore > figureScore) {
				System.out.println(playerName + "获得最终比赛！");
			} else if (playerScore == figureScore) {
				System.out.println(playerName + "与" + figureName + "平分秋色，不分上下！");
			} else {
				System.out.println(figureName + "获得最终比赛！");
			}

			// 结束比赛
			System.exit(0);
		}

		String playerAction = move.action(select);
		// 对手随机选择动作
		int select2 = (int) (Math.random() * move.getMoveLength());// 随机数为[0,列表长度)，可以随机选择列表里的每个动作
		String figureAction = move.action(select2);

		// 打印玩家和对手各个动作
		System.out.println(playerName + "出的是：" + playerAction);
		System.out.println(figureName + "出的是：" + figureAction);
		int result = move.judge(select, select2);// result为判断结果，1为玩家胜，-1为对手胜，0为平局
		if (result == 1) {
			System.out.println(playerName + "获得本局比赛！");
			playerScore++;
		} else if (result == 0) {
			System.out.println(playerName + "和" + figureName + "打成平手！");
			equalScore++;
		} else if (result == -1) {
			System.out.println(playerName + "输," + figureName + "胜！");
			figureScore++;
		}
	}

}
