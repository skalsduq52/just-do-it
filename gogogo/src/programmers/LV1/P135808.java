package programmers.LV1;

import java.util.Arrays;
import java.util.HashMap;

public class P135808 {

	public static void main(String[] args) {
		/*
		 * ����
		 * ���� ����� ��� ���ڸ� �����ϰ� �ֽ��ϴ�. ����� ���¿� ���� 1������ k�������� ������ �з��ϸ�, 
		 * k���� �ֻ�ǰ�� ����̰� 1���� ����ǰ�� ����Դϴ�. ��� �� ������ ������ ������ ���� �����˴ϴ�.
		 * �� ���ڿ� ����� m���� ��� �����մϴ�. ���ڿ� ��� ��� �� ���� ���� ������ p (1 �� p �� k)���� ���, ��� �� ������ ������ p * m �Դϴ�.
		 * ���� ����� ������ ���� ����� �Ⱦ��� ��, ���� �� �ִ� �ִ� ������ ����ϰ��� �մϴ�.(����� ���� �����θ� �Ǹ��ϸ�, ���� ����� �����ϴ�)
		 * 
		 * ���ѻ���
		 * 3 �� k �� 9
		 * 3 �� m �� 10
		 * 7 �� score�� ���� �� 1,000,000
		 * 1 �� score[i] �� k
		 * ������ �߻����� �ʴ� ��쿡�� 0�� return ���ּ���.

		 */
		
		int k = 4;
		int m = 10;
		
		int score[] = {4, 4, 4, 4, 1, 2, 4, 2};
		
		Arrays.sort(score);
		
		int count = 0;
		
		for(int i = score.length-m;i>=0;i-=m) {
			System.out.println(score[i]);
			count += score[i] * m;
		}
		
        	
	}
		
}