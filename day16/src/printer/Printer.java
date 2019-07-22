package printer;
/**
 * 打印机，接口墨盒，纸张
 * @author 钱富根
 * @version 1.0 2019-07-22
 */

public class Printer implements InkBox, Paper {//打印机实现接口墨盒,纸张
	//定义私有变量纸张大小
	private String paper;
	
	//定义私有变量墨盒颜色
	private String color;

	/**
	 * 获得纸张尺寸
	 */
	public String getPaper() {
		return paper;
	}

	/**
	 * 获得墨盒颜色
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 设置纸张尺寸
	 */
	public void setPaper(String paper) {
		this.paper = paper;
	}

	/**
	 * 设置墨盒颜色
	 */
	public void setColor(String color) {
		this.color = color;
	}

}
