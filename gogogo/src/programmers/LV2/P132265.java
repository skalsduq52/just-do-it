package programmers.LV2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class P132265 {

	public static void main(String[] args) {

		/*
		 * ����
		 * ���� ���, ������ũ�� 4���� ������ ������ �÷��� �ִٰ� �սô�. 
		 * ���ε��� 1, 2, 3, 4�� ���� ��ȣ�� ǥ������ ��, ����ũ ���� ���ε��� [1, 2, 1, 3, 1, 4, 1, 2] ������ �÷��� �ֽ��ϴ�. 
		 * ���� �� ��° ����(1)�� �� ��° ����(3) ���̸� �ڸ��� ������ũ�� ������ [1, 2, 1], [3, 1, 4, 1, 2]�� ������ �˴ϴ�.
		 *  ö���� [1, 2, 1]�� ���� ������, ������ [3, 1, 4, 1, 2]�� ���� ������ �԰� �Ǹ� ö���� �� ���� ����(1, 2)�� ���� �� ������,
		 *  ������ �� ���� ����(1, 2, 3, 4)�� ���� �� �����Ƿ�, �̴� �����ϰ� �������� ���� �ƴմϴ�. 
		 *  ���� ������ũ�� �� ��° ����(3)�� �ټ� ��° ����(1) ���̸� �ڸ��� [1, 2, 1, 3], [1, 4, 1, 2]�� ������ �˴ϴ�. 
		 *  �� ��� ö���� �� ���� ����(1, 2, 3)��, ������ �� ���� ����(1, 2, 4)�� ���� �� �����Ƿ�, �̴� �����ϰ� �������� ���Դϴ�. 
		 *  �����ϰ� ������ũ�� �ڸ��� ����� �������� �� �� �ֽ��ϴ�. ���� ������ũ�� [1, 2, 1, 3, 1], [4, 1, 2]���� �߶� �����ϰ� �����ϴ�. 
		 *  � ��쿡�� ������ũ�� �����ϰ� ������ ���� ���� �ֽ��ϴ�.
		 *  
		 *  ���ѻ���
		 *  1 �� topping�� ���� �� 1,000,000
		 *  1 �� topping�� ���� �� 10,000
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
