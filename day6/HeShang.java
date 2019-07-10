package day6;
/**
 * 和尚跳水
 * 
 * @author root
 *
 */
public class HeShang {
	public static void main(String[] args) {
		int water = 0;
		int rise = 5;
		for(int i=0;water<=80;water+=rise,i++) {
			if(i>0) {
				System.out.println("第"+i+"次挑水，水缸装有"+water+"升水");
			}
		}
		System.out.println("总算挑满水了！");
	}
}
