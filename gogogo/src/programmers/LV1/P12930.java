package programmers.LV1;

import java.util.*;

public class P12930 {
	/*
	 * ���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�.
	 *  �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���..
	 * 
	 * s					return
	 * "try hello world"	"TrY HeLlO WoRlD"
	 */

	public static void main(String[] args) {
		
		String s = "try hello world";
		String[]words = s.split(" ");
		
		
		StringBuilder sb = new StringBuilder();
		
		int count = 0;
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count = 0;
				sb.append(" ");
			}else {
				if(count%2==0) {
					sb.append( String.valueOf(s.charAt(i)).toUpperCase());
				}else {
					sb.append( String.valueOf(s.charAt(i)).toLowerCase());
				}
				count++;
			}
		}
		
		System.out.println(sb.toString());
		
	}
	
}
