package ���α׷��ӽ�.LV1;

import java.util.HashMap;

public class ���������˻��ϱ� {

	public static void main(String[] args) {

		/*
		 * ����
		 * ������ īī�� ���� ���� �˻����� ������� �մϴ�.
		 * ���� ���� �˻�� ������ ���� 4�� ��ǥ�� ���� ������ �����մϴ�. ������ �� ��ǥ���� �� ���� �� �ϳ��� �����˴ϴ�.
		 *  
		 *  ���ѻ���
		 *  1 �� s�� ���� �� 10,000
		 *  s�� ���� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
		 *  
		 */
		
		String[] survey = {"TR", "RT", "TR"};
		int[] choices = {7,1,3};
		
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('R', 0);
		map.put('T', 0);
		map.put('C', 0);
		map.put('F', 0);
		map.put('J', 0);
		map.put('M', 0);
		map.put('A', 0);
		map.put('N', 0);
		
		for(int i = 0; i<choices.length;i++) {
			if(choices[i]==0) {
				break;
			}else if(choices[i]>4){
				map.put(survey[i].charAt(1),map.getOrDefault(survey[i].charAt(1), 0)+Math.abs(choices[i]-4));
			}else {
				map.put(survey[i].charAt(0),map.getOrDefault(survey[i].charAt(0), 0)+Math.abs(choices[i]-4));
			}
		}
		
		StringBuilder sb = new StringBuilder();
        if (map.get("R") == map.get("T")) sb.append("R");
        else sb.append((map.get("R") > map.get("T")) ? "R" : "T");
        if (map.get("C") == map.get("F")) sb.append("C");
        else sb.append((map.get("C") > map.get("F")) ? "C" : "F");
        if (map.get("J") == map.get("M")) sb.append("J");
        else sb.append((map.get("J") > map.get("M")) ? "J" : "M");
        if (map.get("A") == map.get("N")) sb.append("A");
        else sb.append((map.get("A") > map.get("N")) ? "A" : "N");
		
		
	}
}
