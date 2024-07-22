package programmers.LV2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P42584 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 
		 * 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
		 *  
		 *  제한사항
		 *  prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
		 *  prices의 길이는 2 이상 100,000 이하입니다.
		 *  
		 */
		
		int[] prices = {1, 2, 3, 2, 3};
		int[] answer = new int[prices.length];
		
		HashMap<Integer,Integer> map = new HashMap<>();
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> que = new LinkedList<Integer>();
		
		int tmp = 0;
		for(int i = 0; i<prices.length-1;i++) {
			tmp = map.getOrDefault(prices.length-i, 0);
			map.put(prices.length-1-i, prices[i]);
			que.add(prices.length-1-i);
			if(tmp>prices[i]) {
				int temp = que.size();
				for(int j = 0; j<temp;j++) {
					int second = que.poll();
					if(prices[i]<map.get(second)) {
						answer[i-1]=second-1;
					}else{
						que.add(second);
					};
				}
			}
		}
		
		int q = 0;
		while(!que.isEmpty()) {
			if(answer[q]==0) {
				int n = que.poll();
				answer[q] = n;
			}
			q++;
		}
		
		
		
		
	}
}
