package programmers.LV2;

public class P12924 {

	public static void main(String[] args) {

		/*
		 * ����
		 * Finn�� ���� ���а��ο� ���� �ֽ��ϴ�. ���� ���θ� �ϴ� Finn�� �ڿ��� n�� ������ �ڿ������ ǥ�� �ϴ� ����� ��������� ����� �˰� �Ǿ����ϴ�. 
		 * ������� 15�� ������ ���� 4������ ǥ�� �� �� �ֽ��ϴ�.
		 * 1 + 2 + 3 + 4 + 5 = 15
		 * 4 + 5 + 6 = 15
		 * 7 + 8 = 15
		 * 15 = 15
		 *  
		 *  ���ѻ���
		 *  n�� 1,000,000 ������ �ڿ��� �Դϴ�.
		 *  
		 */
		
		int n = 15;
		int answer = 0;
		
		for(int i = 1; i<=n;i++) {
			int tmp = i;
			int count = i+1;
			while(tmp<=n) {
				if(tmp==n) {
					answer++;
					break;
				} 
				tmp += count;
				count++;
			}
		}
		
		
	}
}
