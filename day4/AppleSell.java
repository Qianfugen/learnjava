package cn.zlxy;

public class AppleSell {
	public static void main(String[] args) {
		int lastSell = 20;
		double rise = 9.8;
		int currentSell = lastSell + (int)rise;  //double类型强制转为int类型
		System.out.println("今年的市场份额是： "+currentSell);
	}
}
