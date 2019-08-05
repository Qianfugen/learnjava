package practice;

import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		HashMap<String, String> stuMap = new HashMap<String, String>();
		stuMap.put("id", "1001");
		stuMap.put("name", "pipixia");
		stuMap.put("age", "22");

		Set<String> keys = stuMap.keySet();
		for (String key : keys) {
			System.out.println(key+":"+stuMap.get(key));
		}
	}

}
