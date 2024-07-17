package programmers.LV2;

import java.util.Arrays;
import java.util.HashMap;

public class P131127 {

	public static void main(String[] args) {

		/*
		 * ����
		 * �����̰� ���ϴ� ��ǰ�� ��Ÿ���� ���ڿ� �迭 want�� �����̰� ���ϴ� ��ǰ�� ������ ��Ÿ���� ���� �迭 number,
		 *  XYZ ��Ʈ���� �����ϴ� ��ǰ�� ��Ÿ���� ���ڿ� �迭 discount�� �־����� ��, 
		 *  ȸ����Ͻ� �����̰� ���ϴ� ��ǰ�� ��� ���� ���� �� �ִ� ȸ����� ��¥�� �� �ϼ��� return �ϴ� solution �Լ��� �ϼ��Ͻÿ�. 
		 *  ������ ���� ������ 0�� return �մϴ�.
		 *  
		 *  ���ѻ���
		 *  1 �� want�� ���� = number�� ���� �� 10
		 *  1 �� number�� ���� �� 10
		 *  number[i]�� want[i]�� ������ �ǹ��ϸ�, number�� ������ ���� 10�Դϴ�.
		 *  10 �� discount�� ���� �� 100,000
		 *  want�� discount�� ���ҵ��� ���ĺ� �ҹ��ڷ� �̷���� ���ڿ��Դϴ�.
		 *  1 �� want�� ������ ����, discount�� ������ ���� �� 12
		 *  
		 */
		
		String want[] = {"banana", "apple", "rice", "pork", "pot"};
		int number[] = {3, 2, 2, 2, 1};
		String discount[] = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
		int answer = 0;
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i = 0; i<want.length;i++) {
			map.put(want[i], i);
		}
		
		for(int i = 0; i<=discount.length-10;i++) {
			int tmp[] = number.clone();
			if(map.getOrDefault(discount[i],-1) >= 0)  {
				tmp[map.get(discount[i])] = tmp[map.get(discount[i])]==0? 0 : tmp[map.get(discount[i])]-1;
			}
			for(int j = i+1; j<i+10;j++) {
				if(map.getOrDefault(discount[j],-1) >= 0)  {
					tmp[map.get(discount[j])] = tmp[map.get(discount[j])]==0? 0 : tmp[map.get(discount[j])]-1;
				}
			}
			
			if(Arrays.stream(tmp).sum()==0) {
				answer++;
			}
			
		}
		
	}
}
