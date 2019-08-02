package xml;

import java.util.ArrayList;

/**
 * 输入实验次数,看随机产生00000000的概率是多大?
 * @author 钱富根
 * @version 1.0 2019年8月1日
 */
public class Possible {
	public static void main(String[] args) {
		ArrayList<Integer> number= new ArrayList<Integer>();
		for(int i=0;i<10000;i++) {
			for(int j=0;j<8;j++) {
				int num=(int)(Math.random()*10);
				number.add(num);
			}
			System.out.println(number.toString());
			number.clear();
		}
	}
}
