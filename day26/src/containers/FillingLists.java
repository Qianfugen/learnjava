package containers;

import java.util.*;

class StringAddress {
	private String s;

	// 构造方法
	public StringAddress(String s) {
		this.s = s;
	}

	// 方法重写
	public String toString() {
		return super.toString() + " " + s;
	}
}

public class FillingLists {
	public static void main(String[] args) {
		List<StringAddress> list = new ArrayList<StringAddress>(
				Collections.nCopies(4, new StringAddress("Hello")));
		System.out.println(list);
		Collections.fill(list, new StringAddress("World!"));
		System.out.println(list);
	}

}
