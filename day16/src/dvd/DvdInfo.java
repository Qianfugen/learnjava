package dvd;

/**
 * DVD信息
 * @author 钱富根
 * @version 1.0 2019-07-22
 */

public class DvdInfo {
	private String name;// DVD名称
	private int state;// DVD借出状态
	private int date;// DVD借出日期
	private int count;// DVD借出次数

	// 设置setter/getter方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
