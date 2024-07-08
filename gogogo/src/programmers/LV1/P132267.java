package programmers.LV1;

import java.util.*;

public class P132267 {
	/*
	 * 콜라 빈 병 2개를 가져다주면 콜라 1병을 주는 마트가 있다. 빈 병 20개를 가져다주면 몇 병을 받을 수 있는가?
	 * 단, 보유 중인 빈 병이 2개 미만이면, 콜라를 받을 수 없다.
	 * 
	 *  a	b	n	result
	 *  2	1	20	19
	 *  3	1	20	9
	 */

	public static void main(String[] args) {
		
		int a = 3;
		int b = 2;
		int n = 20;
		
		int answer = 0;
		
		while(n>=a) {
			answer += (n/a) * b;
			n = ((n/a) * b) + n%a;
		}
		
	}
	
}
