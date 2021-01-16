package com.test04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.score.Score;

import java.util.Set;

public class MapTest01 { // map은 collection을 상속받고 있지 않기 때문에 put으로 값을 넣어준다.(not add)

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 111; i < 116; i++) {
			
			map.put(i, i + 1000);
		}

		//map.put(112, 1113);

		//System.out.println(map);
		//System.out.println(map.get(112)); // key 값에 맞는 value 리턴

	//	prn(map);
		
		Map<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("1", "프랑스");
        hashmap.put("2", "한국");
        hashmap.put("3", "미국");
        hashmap.put("4", "아랍에미리트");
        hashmap.put("5", "일본");

        System.out.println();
        System.out.println("변경전");
        for (Map.Entry m : hashmap.entrySet()) {
            System.out.printf("[번호 : %s\t국가 : %s]\n", m.getKey(), m.getValue());
        }

        // Value가 '일본'인 entry의 Value를 '중국'으로 변경
        for (Map.Entry m : hashmap.entrySet()) {
            if (m.getValue().equals("일본")) {
                m.setValue("중국");
            }
        }

        System.out.println();
        System.out.println("변경후");
        for (Map.Entry m : hashmap.entrySet()) {
            System.out.printf("[번호 : %s\t국가 : %s]\n", m.getKey(), m.getValue());
        }

	}

	private static void prn(Map<Integer, Integer> map) { // entry : key 따로 value 따로
		Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet(); // Map. 지워도 상관 없음 / .entrySet()->전체 출력하는데 key값과 value 값이 필요한경우 사용한다.
		/*
		 * for(Entry<Integer, Integer> entry : entrySet) { 
		 * if(entry.getValue() == 1113)
		 * { System.out.println(entry.getKey()); 
		 * } }
		 */
		// iterator를 사용해서 위의 forEach문과 같은 결과를 출력하자.

		Iterator<Entry<Integer, Integer>> ir = entrySet.iterator();

		while (ir.hasNext()) {
			Entry<Integer, Integer> tmp = ir.next();
			if (tmp.getValue() == 1113) {
				System.out.println(ir.next().getKey());
			}

		}

	}

}
