package day8;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
//		int min = 0;
//		int max =10;
		Random rand = new Random();
		for(int i =0;i<20;i++) {
			int randNum = rand.nextInt(5);
			System.out.println(randNum);
		}
	}
}
