package programmers.LV1;

import java.util.Arrays;
import java.util.HashMap;

public class P135808 {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 과일 장수가 사과 상자를 포장하고 있습니다. 사과는 상태에 따라 1점부터 k점까지의 점수로 분류하며, 
		 * k점이 최상품의 사과이고 1점이 최하품의 사과입니다. 사과 한 상자의 가격은 다음과 같이 결정됩니다.
		 * 한 상자에 사과를 m개씩 담아 포장합니다. 상자에 담긴 사과 중 가장 낮은 점수가 p (1 ≤ p ≤ k)점인 경우, 사과 한 상자의 가격은 p * m 입니다.
		 * 과일 장수가 가능한 많은 사과를 팔았을 때, 얻을 수 있는 최대 이익을 계산하고자 합니다.(사과는 상자 단위로만 판매하며, 남는 사과는 버립니다)
		 * 
		 * 제한사항
		 * 3 ≤ k ≤ 9
		 * 3 ≤ m ≤ 10
		 * 7 ≤ score의 길이 ≤ 1,000,000
		 * 1 ≤ score[i] ≤ k
		 * 이익이 발생하지 않는 경우에는 0을 return 해주세요.

		 */
		
		int k = 4;
		int m = 10;
		
		int score[] = {4, 4, 4, 4, 1, 2, 4, 2};
		
		Arrays.sort(score);
		
		int count = 0;
		
		for(int i = score.length-m;i>=0;i-=m) {
			System.out.println(score[i]);
			count += score[i] * m;
		}
		
        	
	}
		
}