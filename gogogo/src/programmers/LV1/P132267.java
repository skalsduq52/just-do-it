package programmers.LV1;

import java.util.*;

public class P132267 {
	/*
	 * �ݶ� �� �� 2���� �������ָ� �ݶ� 1���� �ִ� ��Ʈ�� �ִ�. �� �� 20���� �������ָ� �� ���� ���� �� �ִ°�?
	 * ��, ���� ���� �� ���� 2�� �̸��̸�, �ݶ� ���� �� ����.
	 * 
	 *  a	b	n	result
	 *  2	1	20	19
	 *  3	1	20	9
	 */

	public static void main(String[] args) {
		
		int a = 3;
		int b = 2;
		int n = 20;
		
		int answer = 0;
		
		while(n>=a) {
			answer += (n/a) * b;
			n = ((n/a) * b) + n%a;
		}
		
	}
	
}
