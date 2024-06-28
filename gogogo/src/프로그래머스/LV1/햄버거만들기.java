package 프로그래머스.LV1;

import java.util.HashMap;

public class 햄버거만들기 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 햄버거 가게에서 일을 하는 상수는 햄버거를 포장하는 일을 합니다. 
		 * 함께 일을 하는 다른 직원들이 햄버거에 들어갈 재료를 조리해 주면 조리된 순서대로 상수의 앞에 아래서부터 위로 쌓이게 되고, 
		 * 상수는 순서에 맞게 쌓여서 완성된 햄버거를 따로 옮겨 포장을 하게 됩니다. 
		 * 상수가 일하는 가게는 정해진 순서(아래서부터, 빵 – 야채 – 고기 - 빵)로 쌓인 햄버거만 포장을 합니다. 
		 * 상수는 손이 굉장히 빠르기 때문에 상수가 포장하는 동안 속 재료가 추가적으로 들어오는 일은 없으며, 
		 * 재료의 높이는 무시하여 재료가 높이 쌓여서 일이 힘들어지는 경우는 없습니다.
		 *  
		 *  제한사항
		 *  1 ≤ ingredient의 길이 ≤ 1,000,000 
		 *  ingredient의 원소는 1, 2, 3 중 하나의 값이며, 순서대로 빵, 야채, 고기를 의미합니다.
		 *  
		 *  ※ 시간초과 관련해서 
		 *  1. sb에 문자열을 넣고난 후 replace 시도했으나 시간초과
		 *  2. sb에 넣어가면서 sb의 길이가 4를 넘어갈때마다 indexOf를 통해 검사했으나 시간초과
		 *  3. 배열의 길이가 길수록 시간이 많이 걸리나 싶어서 lastIndexOf를 사용했으나 마찬가지로 시간초과
		 *  4. 인덱스로 찾는게 아닌 뒤 문자열 4자리를 떼와 검사하는 방법 사용했을 때 시간 초과 나지않음.
		 *  
		 */
		
		int ingredient[] = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		String s = "";
		StringBuilder sb = new StringBuilder();
		
		int answer = 0; 
		
		for(int i = 0; i<ingredient.length;i++) {
			sb.append(ingredient[i]);
			if(sb.length()>3&&sb.substring(sb.length()-4, sb.length()).equals("1231")) {
				sb.delete(sb.length()-4, sb.length());
				answer++;
			}
			
		}
		
	}
}
