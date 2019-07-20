package fingerguess;

public class Movement {
	// 数组存储动作
	private String[] move = { "石头", "剪刀", "布" };

	/**
	 * 显示动作菜单
	 */
	public void showMovements() {
		for (int i = 0; i < move.length; i++) {
			System.out.println(i + "." + move[i]);
		}
	}

	/**
	 * 出什么动作
	 * 
	 * @param index 通过玩家和对手的选择，转为石头剪刀布
	 * @return 石头剪刀布其中一种动作
	 */
	public String action(int index) {
		return move[index];
	}

	/**
	 * 返回动作列表长度
	 * 
	 * @return
	 */
	public int getMoveLength() {
		return move.length;
	}

	/**
	 * 判断输赢
	 * 
	 * @return 输返回-1，赢返回1，平局返回0
	 */
	public int judge(int select1, int select2) {
		int index = -1;
		// 石头对剪刀，剪刀对布，布对石头，这三种情况下为胜
		if ((select1 == 0 && select2 == 1) || (select1 == 1 && select2 == 2) || (select1 == 2 && select2 == 0)) {
			index = 1;
		} else if (select1 == select2) {
			index = 0;
		} else {
			index = -1;
		}
		return index;
	}
}
