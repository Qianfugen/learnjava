package collection;

import java.util.*;

public class TestHashMap {
	public static void main(String[] args) {
		Map countries = new HashMap();
		countries.put("CN", "中华人民共和国");
		countries.put("RU", "俄罗斯联邦");
		countries.put("FR", "法兰西共和国");
		countries.put("US", "美利坚众合国");

		String country = (String) countries.get("CN");
		System.out.println("CN对应的国家是:" + country);

		System.out.println("Map中共有" + countries.size() + "组数据");

		countries.remove("US");
		System.out.println("Map中包含US的key" + countries.containsKey("US"));

		System.out.println(countries.keySet());
		System.out.println(countries.values());
		System.out.println(countries);
	}
}
