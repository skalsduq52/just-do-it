package ���α׷��ӽ�;

import java.util.*;

public class ����¦�� {

	public static void main(String[] args) {

		/*
		 * ����
		 * �� ���� X, Y�� ������ �ڸ����� �������� ��Ÿ���� ���� k(0 �� k �� 9)���� �̿��Ͽ� ���� �� �ִ� ���� ū ������ �� ���� ¦���̶� �մϴ�
		 * (��, �������� ��Ÿ���� ���� �� ���� ¦���� �� �ִ� ���ڸ� ����մϴ�). X, Y�� ¦���� �������� ������, ¦���� -1�Դϴ�.
		 *  X, Y�� ¦���� 0���θ� �����Ǿ� �ִٸ�, ¦���� 0�Դϴ�.
		 *  ���ѻ���
		 *  3 �� X, Y�� ����(�ڸ���) �� 3,000,000�Դϴ�.
		 *  X, Y�� 0���� �������� �ʽ��ϴ�.
		 *  X, Y�� ¦���� ����� ū ������ �� �����Ƿ�, ���ڿ��� ��ȯ�մϴ�.
		 *  
		 *  �� ������ ���������� 300���ڸ��� ������. "00"�� ���� ��������� integer.parseInt���� ����� �� int�� ������ ����鼭 ������ �߻���.
		 *   - ��ü�� ������ ������ �ʰ� ������ ������ 0���� �����Ѵٸ� ���� 0���� ����ó����.
		 *  
		 */
		
		int[] x = new int[10];
        int[] y = new int[10];
		
		StringBuilder sb = new StringBuilder();
		
		String X = "99999999999999999999";
		String Y = "99999999999999999999";
	
		for(int i = 0; i<X.length();i++) {
			x[Character.getNumericValue(X.charAt(i))]++;
		}
		for(int i = 0; i<Y.length();i++) {
			y[Character.getNumericValue(Y.charAt(i))]++;
		}
		
		for(int i =9; i>=0;i--) {
			int num = 0;
			num = Math.min(x[i],y[i]);
			sb.append(String.valueOf(i).repeat(num));
		}
	
		String answer = sb.toString();
	
		if(answer.equals("")) answer = "-1";
		if(answer.startsWith("0")) answer = "0";
		
		
	}

}
