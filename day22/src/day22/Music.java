package day22;

import java.util.Scanner;

public class Music {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String song;// 插入的新歌曲名称

		// 1.定义老歌曲数组，并赋初值
		String[] oldMusic = { "Ocean", "Pretty", "Mouse", "Dark", "Yesterday" };

		// 2.定义新歌曲数组
		String[] newMusic = new String[oldMusic.length + 1];

		// 3.对老歌曲数组进行排序
		for (int i = 0; i < oldMusic.length - 1; i++) {
			for (int j = 0; j < oldMusic.length - i - 1; j++) {
				if (oldMusic[j].compareTo(oldMusic[j + 1]) > 0) {
					String temp = oldMusic[j];
					oldMusic[j] = oldMusic[j + 1];
					oldMusic[j + 1] = temp;
				}
			}
		}

		// 4.输出老歌曲数组
		System.out.print("插入前歌曲列表： ");
		for (String m : oldMusic) {
			System.out.print(m + "\t");
		}
		System.out.println();

		// 5.将老歌曲分别赋值给新歌曲数组
		for (int i = 0; i < oldMusic.length; i++) {
			newMusic[i] = oldMusic[i];
		}

		// 6.输入要插入的新歌曲名称
		System.out.print("请输入插入的新歌曲：");
		song = input.next();

		// 7.比较判断要插入的位置：新歌曲名称小于老歌曲，该位置即为要插入的位置
		int index = newMusic.length - 1;
		for (int i = 0; i < oldMusic.length; i++) {
			if (song.compareTo(oldMusic[i]) < 0) {
				index = i;
				break;
			}
		}

		// 8.从新歌曲的最后一个位置开始，将前一位歌曲移到新歌曲的最后一位，直至移到要插入的位置为止
		for (int i = newMusic.length - 1; i > index; i--) {
			newMusic[i] = newMusic[i - 1];
		}

		// 9.将新歌曲直接复制到要插入的位置
		newMusic[index] = song;

		// 10.输出新歌曲数组
		System.out.print("插入后的歌曲列表: ");
		for (String m : newMusic) {
			System.out.print(m + "\t");
		}
	}
}
