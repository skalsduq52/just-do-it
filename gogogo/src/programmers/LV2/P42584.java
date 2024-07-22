package programmers.LV2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P42584 {

	public static void main(String[] args) {

		/*
		 * ����
		 * �� ������ ��ϵ� �ֽİ����� ��� �迭 prices�� �Ű������� �־��� ��, 
		 * ������ �������� ���� �Ⱓ�� �� �������� return �ϵ��� solution �Լ��� �ϼ��ϼ���.
		 *  
		 *  ���ѻ���
		 *  prices�� �� ������ 1 �̻� 10,000 ������ �ڿ����Դϴ�.
		 *  prices�� ���̴� 2 �̻� 100,000 �����Դϴ�.
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
