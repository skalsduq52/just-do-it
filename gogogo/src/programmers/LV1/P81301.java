package programmers.LV1;

import java.util.*;

public class P81301 {
	/*
	 * �׿��� ���ε��� ���ڳ��̸� �ϰ� �ֽ��ϴ�. �׿��� ���ε����� ���ڸ� �ǳ� �� �Ϻ� �ڸ����� ���ܾ�� �ٲ� ī�带 �ǳ��ָ� ���ε��� ���� ���ڸ� ã�� �����Դϴ�.
	 * 
	 * s					result
	 * "one4seveneight"		1478
	 * "23four5six7"		234567
	 * "2three45sixseven"	234567
	 * "123"				123
	 */

	public static void main(String[] args) {
		
		String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String s = "one4seveneight";
				
		for(int i = 0; i<=9;i++) {
			s= s.replaceAll(number[i], String.valueOf(i));
		}
		
		Integer.parseInt(s);
		
	}
	
}
