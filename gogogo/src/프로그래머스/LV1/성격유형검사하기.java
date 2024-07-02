package 프로그래머스.LV1;

import java.util.HashMap;

public class 성격유형검사하기 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 나만의 카카오 성격 유형 검사지를 만들려고 합니다.
		 * 성격 유형 검사는 다음과 같은 4개 지표로 성격 유형을 구분합니다. 성격은 각 지표에서 두 유형 중 하나로 결정됩니다.
		 *  
		 *  제한사항
		 *  1 ≤ s의 길이 ≤ 10,000
		 *  s는 영어 소문자로만 이루어져 있습니다.
		 *  
		 */
		
		String[] survey = {"TR", "RT", "TR"};
		int[] choices = {7,1,3};
		
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('R', 0);
		map.put('T', 0);
		map.put('C', 0);
		map.put('F', 0);
		map.put('J', 0);
		map.put('M', 0);
		map.put('A', 0);
		map.put('N', 0);
		
		for(int i = 0; i<choices.length;i++) {
			if(choices[i]==0) {
				break;
			}else if(choices[i]>4){
				map.put(survey[i].charAt(1),map.getOrDefault(survey[i].charAt(1), 0)+Math.abs(choices[i]-4));
			}else {
				map.put(survey[i].charAt(0),map.getOrDefault(survey[i].charAt(0), 0)+Math.abs(choices[i]-4));
			}
		}
		
		StringBuilder sb = new StringBuilder();
        if (map.get("R") == map.get("T")) sb.append("R");
        else sb.append((map.get("R") > map.get("T")) ? "R" : "T");
        if (map.get("C") == map.get("F")) sb.append("C");
        else sb.append((map.get("C") > map.get("F")) ? "C" : "F");
        if (map.get("J") == map.get("M")) sb.append("J");
        else sb.append((map.get("J") > map.get("M")) ? "J" : "M");
        if (map.get("A") == map.get("N")) sb.append("A");
        else sb.append((map.get("A") > map.get("N")) ? "A" : "N");
		
		
	}
}
