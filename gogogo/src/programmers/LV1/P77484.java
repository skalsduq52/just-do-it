package programmers.LV1;

import java.util.*;
import java.io.*;

public class P77484 {

	public static void main(String[] args) throws IOException {
		
		
		/*
		 * ����
		 * �ζǸ� ������ �ο�� ��÷ ��ȣ ��ǥ���� �м�����ϰ� �־����ϴ�. ������, �ο��� ������ �ζǿ� ������ �Ͽ�, 
		 * �Ϻ� ��ȣ�� �˾ƺ� �� ���� �Ǿ����ϴ�. ��÷ ��ȣ ��ǥ ��, �ο�� �ڽ��� �����ߴ� �ζǷ� ��÷�� �����ߴ� �ְ� ������ ���� ������ �˾ƺ��� �;� �����ϴ�.
		 *  
		 *  ���ѻ���
		 *  lottos�� ���� 6�� ���� �迭�Դϴ�.
		 *  lottos�� ��� ���Ҵ� 0 �̻� 45 ������ �����Դϴ�.
		 *   0�� �˾ƺ� �� ���� ���ڸ� �ǹ��մϴ�.
		 *   0�� ������ �ٸ� ���ڵ��� lottos�� 2�� �̻� ������� �ʽ��ϴ�.
		 *   lottos�� ���ҵ��� ���ĵǾ� ���� ���� ���� �ֽ��ϴ�.
		 *   win_nums�� ���� 6�� ���� �迭�Դϴ�.
		 *   win_nums�� ��� ���Ҵ� 1 �̻� 45 ������ �����Դϴ�.
		 *   win_nums���� ���� ���ڰ� 2�� �̻� ������� �ʽ��ϴ�.
		 *   win_nums�� ���ҵ��� ���ĵǾ� ���� ���� ���� �ֽ��ϴ�.
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