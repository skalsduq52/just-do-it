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
		 * ����
		 * ���� ���� ��� ť(Queue)�� �ִ� ���μ����� �߿䵵�� ������� ��� �迭 priorities��, 
		 * �� ��°�� ����Ǵ��� �˰���� ���μ����� ��ġ�� �˷��ִ� location�� �Ű������� �־��� ��, 
		 * �ش� ���μ����� �� ��°�� ����Ǵ��� return �ϵ��� solution �Լ��� �ۼ����ּ���
		 *  
		 *  ���ѻ���
		 *  priorities�� ���̴� 1 �̻� 100 �����Դϴ�.
		 *  priorities�� ���Ҵ� 1 �̻� 9 ������ �����Դϴ�.
		 *  priorities�� ���Ҵ� �켱������ ��Ÿ���� ���ڰ� Ŭ ���� �켱������ �����ϴ�.
		 *  location�� 0 �̻� (��� ť�� �ִ� ���μ��� �� - 1) ������ ���� �����ϴ�.
		 *  priorities�� ���� �տ� ������ 0, �� ��°�� ������ 1 �� �� ���� ǥ���մϴ�.
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
