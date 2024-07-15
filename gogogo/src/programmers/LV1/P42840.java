package programmers.LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class P42840 {

	public static void main(String[] args) {
		/*
		 * ����
		 * �����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.
		 * 1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
		 * 2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
		 * 3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
		 * 1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
		 * 
		 * ���ѻ���
		 * ������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
		 * ������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
		 * ���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.

		 */
		
		int[][] answer = {{1,0},{2,0},{3,0}};
		List<Integer> list = new ArrayList<>();
		
		int one[] = {1,2,3,4,5};
		int two[] = {2,1,2,3,2,4,2,5};
		int three[] = {3,3,1,1,2,2,4,4,5,5};
		
		answer[0][1] = check(one);
		answer[1][1] = check(two);
		answer[2][1] = check(three);
		
		Arrays.sort(answer, new Comparator<int[]>() {
			public int compare(int[] s1, int[] s2) {
				return  s2[1] - s1[1];
			}
		});
		
		list.add(answer[0][0]);
		for(int i=1;i<answer.length;i++) {
			if(answer[i][1]==answer[0][1]) {
				list.add(answer[i][0]);
			}else {
				break;
			}
		}
		
		
	}
	
	public static int check(int[] tester) {
		
		int answers[] = {1, 2, 3, 4, 5};
		int count = 0;
		int tmp = 0;
		
		for(int i = 0; i<answers.length;i++) {
			if (answers[i] == tester[tmp]) count++;
			tmp = tmp>tester.length? 0 : tmp+1;
		}
		
		
		return count;
	}
		
}