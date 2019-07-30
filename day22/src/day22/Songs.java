package day22;

public class Songs {

	public static void main(String[] args) {
		String[] oldSongList = { "Yesterday", "One more time", "Hello World", "Mouse like rice", "Keep on" };
		String[] newSongList = new String[oldSongList.length + 1];
		String newsong = "Zomorrow will be better";
		int index = -1;// 插入新歌的位置

		// 老歌排序,冒泡排序法
		for (int i = 0; i < oldSongList.length - 1; i++) {
			for (int j = 0; j < oldSongList.length - i - 1; j++) {
				if (oldSongList[j].compareTo(oldSongList[j + 1]) > 0) {
					String temp = oldSongList[j];
					oldSongList[j] = oldSongList[j + 1];
					oldSongList[j + 1] = temp;
				}
			}
		}

		// 找到插入新歌的位置
		for (int i = 0; i < oldSongList.length; i++) {
			String oldsong = oldSongList[i];
			if (newsong.compareTo(oldsong) < 0) {
				index = i; // 新歌插入的下标
				break;
			} else {
				index = oldSongList.length;
			}
		}

		// 插入新歌
		for (int i = 0; i < newSongList.length; i++) {
			if (i < index) {
				newSongList[i] = oldSongList[i];
			} else if (i == index) {
				newSongList[i] = newsong;
			} else {
				newSongList[i] = oldSongList[i - 1];
			}
		}

		// 打印歌单
		for (String song : newSongList) {
			System.out.println(song);
		}

	}

}
