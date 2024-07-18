package programmers.LV2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class P132265 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 예를 들어, 롤케이크에 4가지 종류의 토핑이 올려져 있다고 합시다. 
		 * 토핑들을 1, 2, 3, 4와 같이 번호로 표시했을 때, 케이크 위에 토핑들이 [1, 2, 1, 3, 1, 4, 1, 2] 순서로 올려져 있습니다. 
		 * 만약 세 번째 토핑(1)과 네 번째 토핑(3) 사이를 자르면 롤케이크의 토핑은 [1, 2, 1], [3, 1, 4, 1, 2]로 나뉘게 됩니다.
		 *  철수가 [1, 2, 1]이 놓인 조각을, 동생이 [3, 1, 4, 1, 2]가 놓인 조각을 먹게 되면 철수는 두 가지 토핑(1, 2)을 맛볼 수 있지만,
		 *  동생은 네 가지 토핑(1, 2, 3, 4)을 맛볼 수 있으므로, 이는 공평하게 나누어진 것이 아닙니다. 
		 *  만약 롤케이크의 네 번째 토핑(3)과 다섯 번째 토핑(1) 사이를 자르면 [1, 2, 1, 3], [1, 4, 1, 2]로 나뉘게 됩니다. 
		 *  이 경우 철수는 세 가지 토핑(1, 2, 3)을, 동생도 세 가지 토핑(1, 2, 4)을 맛볼 수 있으므로, 이는 공평하게 나누어진 것입니다. 
		 *  공평하게 롤케이크를 자르는 방법은 여러가지 일 수 있습니다. 위의 롤케이크를 [1, 2, 1, 3, 1], [4, 1, 2]으로 잘라도 공평하게 나뉩니다. 
		 *  어떤 경우에는 롤케이크를 공평하게 나누지 못할 수도 있습니다.
		 *  
		 *  제한사항
		 *  1 ≤ topping의 길이 ≤ 1,000,000
		 *  1 ≤ topping의 원소 ≤ 10,000
		 *  
		 */
		int answer = 0;
		
		int topping[] = {1, 2, 1, 3, 1, 4, 1, 2};
		HashMap<Integer,Integer> oldMap = new HashMap<>();
		HashMap<Integer,Integer> youngMap = new HashMap<>();
		
		oldMap.put(topping[0], 1);
		
		for(int i = 1; i<topping.length;i++) {
			youngMap.put(topping[i], youngMap.getOrDefault(topping[i], 0)+1);
		}
		
		for(int i = 1; i<topping.length;i++) {
			oldMap.put(topping[i], oldMap.getOrDefault(topping[i], 0)+1);
			int tmp = youngMap.getOrDefault(topping[i], 0);
			if(tmp>1) {
				youngMap.put(topping[i], tmp-1);
			}else {
				youngMap.remove(topping[i]);
			}
			
			if(oldMap.size()==youngMap.size()) answer++;
			if(oldMap.size()>youngMap.size()) break;
		}
		
		
		System.out.println(answer);
	}
}
