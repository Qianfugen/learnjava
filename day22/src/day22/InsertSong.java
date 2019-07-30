package day22;

public class InsertSong {
	public static void main(String[] args) {
		//老歌列表
		String songList[]={"A","G","D","E","F"};
		
		//新歌列表
		String newSongList[]=new String[songList.length+1];
		String newSong="C";
		
		//放入新数组
		for(int i=0;i<songList.length;i++) {
			newSongList[i]=songList[i];
		}
		newSongList[5]=newSong;
		
		//冒泡排序
		for(int i=0;i<newSongList.length-1;i++) {
			for(int j=0;j<newSongList.length-i-1;j++) {
				if(newSongList[j].compareTo(newSongList[j+1])>0) {
					String temp=newSongList[j];
					newSongList[j]=newSongList[j+1];
					newSongList[j+1]=temp;
				}
			}
		}
		
		//打印歌曲列表
		for(String s:newSongList) {
			System.out.print(s+"\t");
		}

	}
}
