package com.test02;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class onlyTest {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 111; i < 116; i++) {
			map.put(i, i + 1000);

		}
		//map.put(112, 1113);
		// System.out.println(map);
		// System.out.println(map.get(114));
		prn(map);
	}

	private static void prn(Map<Integer, Integer> map) {

		Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
		
		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() == 1113) {
				System.out.println(entry.getKey());
			}
			//System.out.println(entrySet);

		}
	}
}
