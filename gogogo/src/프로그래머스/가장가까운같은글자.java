package ���α׷��ӽ�;

import java.util.*;

public class ���尡�������� {
	/*
	 * ���ڿ� s�� �־����� ��, s�� �� ��ġ���� �ڽź��� �տ� �������鼭, �ڽŰ� ���� ����� ���� �ִ� ���� ���ڰ� ��� �ִ��� �˰� �ͽ��ϴ�.
     * ���� ���, s="banana"��� �� ��,  �� ���ڵ��� ���ʺ��� ���������� �о� �����鼭 ������ ���� ������ �� �ֽ��ϴ�.
	 * 
	 *  s			result
	 *  "banana"	[-1, -1, -1, 2, 2, 2]
	 *  "foobar"	[-1, -1, 1, -1, -1, -1]
	 */

	public static void main(String[] args) {
		
		String s = "foobar";
		int[] answer = new int[s.length()];
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i = 0; i<s.length();i++) {
			if (map.get(s.charAt(i)) == null) {
				answer[i] = -1;
			}else{
				answer[i] = i - map.get(s.charAt(i));
			};
			map.put(s.charAt(i), i);
		}
		
	}
	
}
