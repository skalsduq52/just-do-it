package programmers.LV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P42587 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 현재 실행 대기 큐(Queue)에 있는 프로세스의 중요도가 순서대로 담긴 배열 priorities와, 
		 * 몇 번째로 실행되는지 알고싶은 프로세스의 위치를 알려주는 location이 매개변수로 주어질 때, 
		 * 해당 프로세스가 몇 번째로 실행되는지 return 하도록 solution 함수를 작성해주세요
		 *  
		 *  제한사항
		 *  priorities의 길이는 1 이상 100 이하입니다.
		 *  priorities의 원소는 1 이상 9 이하의 정수입니다.
		 *  priorities의 원소는 우선순위를 나타내며 숫자가 클 수록 우선순위가 높습니다.
		 *  location은 0 이상 (대기 큐에 있는 프로세스 수 - 1) 이하의 값을 가집니다.
		 *  priorities의 가장 앞에 있으면 0, 두 번째에 있으면 1 … 과 같이 표현합니다.
		 */
		
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		int answer = 1;
		
		Queue<Integer> que = new LinkedList<>();
		
		int[] sortedArray = priorities.clone();
        Arrays.sort(sortedArray);
		
		for(int i = 0; i<priorities.length;i++) {
			que.add(priorities[i]);
		}
		
		int maxnum = priorities.length-1;
		
		while(location != -1) {
			int num = sortedArray[maxnum];
			
			int temp = que.poll();
			if(temp == num) {
				if(location == 0) {
					break;
				}
				maxnum--;
				answer++;
				location--;
			}else {
				que.add(temp);
				location = location == 0? que.size()-1: location-1; 
			}
		}
		
	}
}
