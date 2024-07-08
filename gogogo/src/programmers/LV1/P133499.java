package programmers.LV1;

import java.util.HashMap;

public class P133499 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다. 
		 * 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다. 
		 * 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
		 *  
		 *  제한사항
		 *  1 ≤ babbling의 길이 ≤ 100
		 *  1 ≤ babbling[i]의 길이 ≤ 30
		 *  문자열은 알파벳 소문자로만 이루어져 있습니다.
		 *  
		 */
		
		String babbling[] = {"ayayemaaya"};
		String pron[] = {"aya", "ye", "woo", "ma"};
		String hh[] = {"ayaaya", "yeye", "woowoo", "mama"};
		HashMap<String,Boolean> map = new HashMap<>();
		
		for(int i =0; i<pron.length;i++) {
			map.put(pron[i], false);
		}
		
		int answer = 0;
		
		for(int i =0 ;i<babbling.length;i++) {
			String babble = babbling[i];
			for(int j =0; j<pron.length;j++) {
					babble = babble.replaceAll(hh[j], "0").replaceAll(pron[j], " ");
			}
			babble = babble.replace(" ", "");
			if(babble.length()  == 0) answer++;
		}
		System.out.println(answer);
		
		
	}
}
