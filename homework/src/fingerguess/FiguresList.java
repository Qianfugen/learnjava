package fingerguess;

/**
 * 猜拳游戏
 * @author root
 *@version 1.0 2019-07-26
 */
public class FiguresList {
	private String[] figures = { "刘备", "张飞", "关羽" };

	public void showlist() {
		for (int i = 0; i < figures.length; i++) {
			System.out.println(i + "." + figures[i]);
		}
	}

	public String showFigure(int index) {
		return figures[index];
	}
}
