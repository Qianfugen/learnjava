package containers;

public class TestPair {

	public static void main(String[] args) {
		Pair<String, Integer> info = new Pair<String, Integer>("age", 24);
		System.out.println(info.getFirst() + ":" + info.getSecond());
	}

}
