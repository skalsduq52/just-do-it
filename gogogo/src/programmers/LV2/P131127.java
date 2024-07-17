package programmers.LV2;

import java.util.Arrays;
import java.util.HashMap;

public class P131127 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 정현이가 원하는 제품을 나타내는 문자열 배열 want와 정현이가 원하는 제품의 수량을 나타내는 정수 배열 number,
		 *  XYZ 마트에서 할인하는 제품을 나타내는 문자열 배열 discount가 주어졌을 때, 
		 *  회원등록시 정현이가 원하는 제품을 모두 할인 받을 수 있는 회원등록 날짜의 총 일수를 return 하는 solution 함수를 완성하시오. 
		 *  가능한 날이 없으면 0을 return 합니다.
		 *  
		 *  제한사항
		 *  1 ≤ want의 길이 = number의 길이 ≤ 10
		 *  1 ≤ number의 원소 ≤ 10
		 *  number[i]는 want[i]의 수량을 의미하며, number의 원소의 합은 10입니다.
		 *  10 ≤ discount의 길이 ≤ 100,000
		 *  want와 discount의 원소들은 알파벳 소문자로 이루어진 문자열입니다.
		 *  1 ≤ want의 원소의 길이, discount의 원소의 길이 ≤ 12
		 *  
		 */
		
		String want[] = {"banana", "apple", "rice", "pork", "pot"};
		int number[] = {3, 2, 2, 2, 1};
		String discount[] = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
		int answer = 0;
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i = 0; i<want.length;i++) {
			map.put(want[i], i);
		}
		
		for(int i = 0; i<=discount.length-10;i++) {
			int tmp[] = number.clone();
			if(map.getOrDefault(discount[i],-1) >= 0)  {
				tmp[map.get(discount[i])] = tmp[map.get(discount[i])]==0? 0 : tmp[map.get(discount[i])]-1;
			}
			for(int j = i+1; j<i+10;j++) {
				if(map.getOrDefault(discount[j],-1) >= 0)  {
					tmp[map.get(discount[j])] = tmp[map.get(discount[j])]==0? 0 : tmp[map.get(discount[j])]-1;
				}
			}
			
			if(Arrays.stream(tmp).sum()==0) {
				answer++;
			}
			
		}
		
	}
}
