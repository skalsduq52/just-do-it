package 프로그래머스;

import java.util.*;

public class 가장가까운같은글자 {
	/*
	 * 문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다.
     * 예를 들어, s="banana"라고 할 때,  각 글자들을 왼쪽부터 오른쪽으로 읽어 나가면서 다음과 같이 진행할 수 있습니다.
	 * 
	 *  s			result
	 *  "banana"	[-1, -1, -1, 2, 2, 2]
	 *  "foobar"	[-1, -1, 1, -1, -1, -1]
	 */

	public static void main(String[] args) {
		
		String s = "foobar";
		int[] answer = new int[s.length()];
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i = 0; i<s.length();i++) {
			if (map.get(s.charAt(i)) == null) {
				answer[i] = -1;
			}else{
				answer[i] = i - map.get(s.charAt(i));
			};
			map.put(s.charAt(i), i);
		}
		
	}
	
}
