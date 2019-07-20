package day15;

/**
 * 猜拳游戏
 * @author 钱富根
 * @version 2.0 2019-07-19
 */

public class Operator {
	//figures数组存放对手
	String[] figures = {"曹操","刘备","孙权","鲁肃","关羽"};
	
	//options数组存放动作
	String[] options= {"石头","剪刀","布"};
	
	//玩家和对手分数
	int playerScore=0;
	int figureScore=0;
	
	/**
	 * 显示人物列表
	 */
	public void showFigures() {
		for(int i=0;i<figures.length;i++) {
			System.out.println((i+1)+"."+figures[i]);
		}
	}
	
	/**
	 * 显示操作列表
	 */
	public void showOptions() {
		for(int i=0;i<options.length;i++) {
			System.out.println((i+1)+"."+options[i]);
		}
	}
	
	/**
	 * 获取对手姓名
	 * @param id 游戏对手id
	 * @return	游戏对手姓名
	 */
	public String getName(int id) {
		return figures[id-1];
	}
	
	/**
	 * 游戏方法
	 * @param select 玩家的操作
	 * @return
	 */
	public String pk(int select) {
		String answer;
		if(select==0) {	//退出
			//打印比赛结果
			System.out.println("本局比赛得分： 玩家： "+playerScore+"\t对手： "+figureScore);
			if(playerScore>figureScore) {
				System.out.println("你赢得了本局比赛！");
			}else if(playerScore==figureScore) {
				System.out.println("平局");
			}else {
				System.out.println("你输了本局比赛！");
			}
			return "谢谢参与！";
		}
		
		//打印每局比赛赛况
		System.out.println("您出的是："+options[select-1]);
		int figureNo = (int)(Math.random()*3);		//对手的操作随机生成
		System.out.println("对手出的是："+options[figureNo]);
		
		//条件判断，石头胜剪刀，剪刀胜布，布胜石头，并计分
		if((select ==1 && figureNo ==1) || (select ==2 && figureNo ==2)|| (select ==3 && figureNo ==0)) {
			answer = "恭喜你！你赢了！";
			playerScore++;
		}else if((select ==1 && figureNo ==0) || (select ==2 && figureNo ==1)|| (select ==3 && figureNo ==2)) {
			answer="平局";
		}else{
			answer="真遗憾，你输了！";
			figureScore++;
		}
		//返回每局比赛结果
		return answer;
	}
	
}
