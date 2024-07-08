package programmers.LV1;

import java.util.*;

public class P81301 {
	/*
	 * 네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
	 * 
	 * s					result
	 * "one4seveneight"		1478
	 * "23four5six7"		234567
	 * "2three45sixseven"	234567
	 * "123"				123
	 */

	public static void main(String[] args) {
		
		String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String s = "one4seveneight";
				
		for(int i = 0; i<=9;i++) {
			s= s.replaceAll(number[i], String.valueOf(i));
		}
		
		Integer.parseInt(s);
		
	}
	
}
