package programmers.LV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P42586 {

	public static void main(String[] args) {

		/*
		 * ����
		 * ���α׷��ӽ� �������� ��� ���� �۾��� ���� ���Դϴ�. �� ����� ������ 100%�� �� ���񽺿� �ݿ��� �� �ֽ��ϴ�.
		 * ��, �� ����� ���߼ӵ��� ��� �ٸ��� ������ �ڿ� �ִ� ����� �տ� �ִ� ��ɺ��� ���� ���ߵ� �� �ְ�, �̶� �ڿ� �ִ� ����� �տ� �ִ� ����� ������ �� �Բ� �����˴ϴ�.
		 * ���� �����Ǿ�� �ϴ� ������� �۾��� ������ ���� ���� �迭 progresses�� �� �۾��� ���� �ӵ��� ���� ���� �迭 speeds�� �־��� ��
		 *  �� �������� �� ���� ����� �����Ǵ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.
		 *  
		 *  ���ѻ���
		 *  �۾��� ����(progresses, speeds�迭�� ����)�� 100�� �����Դϴ�.
		 *  �۾� ������ 100 �̸��� �ڿ����Դϴ�.
		 *  �۾� �ӵ��� 100 ������ �ڿ����Դϴ�.
		 *  ������ �Ϸ翡 �� ���� �� �� ������, �Ϸ��� ���� �̷�����ٰ� �����մϴ�. ���� ��� �������� 95%�� �۾��� ���� �ӵ��� �Ϸ翡 4%��� ������ 2�� �ڿ� �̷�����ϴ�.
		 */
		
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		Queue<Integer> que = new LinkedList<>();
		
		for(int i = 0 ;i<progresses.length;i++) {
			que.add( (int)Math.ceil((double)(100-progresses[i])/speeds[i]));
		}
		
		List<Integer> list = new ArrayList<>();
		
		int temp = 0;
		int count = 0;
		while(!que.isEmpty()) {
			count = 1;
			
			temp = que.poll();
			while(!que.isEmpty() && (temp>=que.peek())) {
				que.poll();
				count++;
			}
			list.add(count);
			
		}
		
		
		
	}
}
