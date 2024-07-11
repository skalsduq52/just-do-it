package programmers.LV1;

import java.util.*;
import java.io.*;

public class P77484 {

	public static void main(String[] args) throws IOException {
		
		
		/*
		 * 문제
		 * 로또를 구매한 민우는 당첨 번호 발표일을 학수고대하고 있었습니다. 하지만, 민우의 동생이 로또에 낙서를 하여, 
		 * 일부 번호를 알아볼 수 없게 되었습니다. 당첨 번호 발표 후, 민우는 자신이 구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 알아보고 싶어 졌습니다.
		 *  
		 *  제한사항
		 *  lottos는 길이 6인 정수 배열입니다.
		 *  lottos의 모든 원소는 0 이상 45 이하인 정수입니다.
		 *   0은 알아볼 수 없는 숫자를 의미합니다.
		 *   0을 제외한 다른 숫자들은 lottos에 2개 이상 담겨있지 않습니다.
		 *   lottos의 원소들은 정렬되어 있지 않을 수도 있습니다.
		 *   win_nums은 길이 6인 정수 배열입니다.
		 *   win_nums의 모든 원소는 1 이상 45 이하인 정수입니다.
		 *   win_nums에는 같은 숫자가 2개 이상 담겨있지 않습니다.
		 *   win_nums의 원소들은 정렬되어 있지 않을 수도 있습니다.
		 *  
		 */
		
		int lottos[] = {45, 4, 35, 20, 3, 9};
		int win_nums[] = {21, 10, 5, 44, 6, 32};
		int[] answer = new int[2];
		int count = 0;
		int tmp = 0;
		
		HashMap<Integer,Boolean> map = new HashMap<>();
		HashMap<Integer,Integer> rank = new HashMap<>();
		rank.put(6,1);
		rank.put(5,2);
		rank.put(4,3);
		rank.put(3,4);
		rank.put(2,5);
		
		for(int i = 0; i<lottos.length;i++) {
			if(lottos[i]==0) {
				count++;
			}else {
				map.put(lottos[i], true);
			}
		}
		
		for(int i = 0; i<win_nums.length;i++) {
			if(map.getOrDefault(win_nums[i], false)) {
				tmp++;
			}
		}
		
		answer[0] = rank.getOrDefault(tmp+count, 6);
		answer[1] = rank.getOrDefault(tmp, 6);
        
	}
		
}