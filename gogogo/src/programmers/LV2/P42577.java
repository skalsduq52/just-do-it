package programmers.LV2;

import java.util.Arrays;
import java.util.HashMap;

public class P42577 {

	public static void main(String[] args) {

		/*
		 * ����
		 * ��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
		 * ��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.
		 *  
		 *  ���ѻ���
		 *  phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
		 *  �� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.
		 *  ���� ��ȭ��ȣ�� �ߺ��ؼ� ������� �ʽ��ϴ�.
		 */
		
		String[] phone_book = {"12","123","1235","567","88"};
		boolean answer = true;
		
		Arrays.sort(phone_book);
		
		for (int i = 0; i < phone_book.length - 1; i++) {
            String s = phone_book[i];
            if (phone_book[i + 1].startsWith(s)) {
                answer =  false;
            }
        }

		System.out.println(answer);
		
		
	}
}
