package programmers.LV1;

import java.util.*;

public class P12930 {
	/*
	 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
	 *  각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요..
	 * 
	 * s					return
	 * "try hello world"	"TrY HeLlO WoRlD"
	 */

	public static void main(String[] args) {
		
		String s = "try hello world";
		String[]words = s.split(" ");
		
		
		StringBuilder sb = new StringBuilder();
		
		int count = 0;
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count = 0;
				sb.append(" ");
			}else {
				if(count%2==0) {
					sb.append( String.valueOf(s.charAt(i)).toUpperCase());
				}else {
					sb.append( String.valueOf(s.charAt(i)).toLowerCase());
				}
				count++;
			}
		}
		
		System.out.println(sb.toString());
		
	}
	
}
