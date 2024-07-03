package 프로그래머스.LV2;

import java.util.Arrays;
import java.util.HashMap;

public class 영어끝말잇기 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 문자열 s가 입력되었을 때 다음 규칙을 따라서 이 문자열을 여러 문자열로 분해하려고 합니다.
		 * 먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
		 * 이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서, x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다. 
		 * 처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
		 *  
		 *  제한사항
		 *  1 ≤ s의 길이 ≤ 10,000
		 *  s는 영어 소문자로만 이루어져 있습니다.
		 *  
		 */
		
		String[] words= {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		int n = 3;
		
		int[] answer = {0,0};
		HashMap<String, Boolean> map = new HashMap<>();
		map.put(words[0], true);
		
		char startWord;
		char endWord = words[0].charAt(words[0].length()-1);
		
		
		for(int i = 1; i<words.length;i++) {
			startWord = words[i].charAt(0);
			if(startWord != endWord || map.getOrDefault(words[i], false) ) {
				answer[0] = i%n+1;
				answer[1] = i/n+1;
				break;
			}else {
				map.put(words[i], true);
				endWord = words[i].charAt(words[i].length()-1);
			}
		}
		
		
		
	}
}
