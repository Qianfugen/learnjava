package day11;

public class ZhzZhiJi {
	public String zhaZhi(String fruit) {
		return fruit+"汁";
	}
	public static void main(String[] args) {
		ZhzZhiJi zzj = new ZhzZhiJi();
		String s = zzj.zhaZhi("西瓜");
		System.out.println(s);
	}
}
