package programmers.LV2;

public class P12911 {

	public static void main(String[] args) {

		/*
		 * ����
		 * �ڿ��� n�� �־����� ��, n�� ���� ū ���ڴ� ������ ���� ���� �մϴ�.
		 * ���� 1. n�� ���� ū ���ڴ� n���� ū �ڿ��� �Դϴ�.
		 * ���� 2. n�� ���� ū ���ڿ� n�� 2������ ��ȯ���� �� 1�� ������ �����ϴ�.
		 * ���� 3. n�� ���� ū ���ڴ� ���� 1, 2�� �����ϴ� �� �� ���� ���� �� �Դϴ�.
		 * ���� �� 78(1001110)�� ���� ū ���ڴ� 83(1010011)�Դϴ�.
		 *  
		 *  ���ѻ���
		 *  n�� 1,000,000 ������ �ڿ��� �Դϴ�.
		 *  
		 */
		
		int n = 78;
		int count = Integer.bitCount(n);
		int answer = 0;
		
		while(true) {
			n++;
			if(Integer.bitCount(n) == count) {
				answer = n;
				break;
			} 
			
		}
		
	}
}
