package ���α׷��ӽ�.LV2;

import java.util.Arrays;
import java.util.HashMap;

public class ������ձ� {

	public static void main(String[] args) {

		/*
		 * ����
		 * ���ڿ� s�� �ԷµǾ��� �� ���� ��Ģ�� ���� �� ���ڿ��� ���� ���ڿ��� �����Ϸ��� �մϴ�.
		 * ���� ù ���ڸ� �н��ϴ�. �� ���ڸ� x��� �սô�.
		 * ���� �� ���ڿ��� ���ʿ��� ���������� �о���鼭, x�� x�� �ƴ� �ٸ� ���ڵ��� ���� Ƚ���� ���� ���ϴ�. 
		 * ó������ �� Ƚ���� �������� ���� ���߰�, ���ݱ��� ���� ���ڿ��� �и��մϴ�.
		 *  
		 *  ���ѻ���
		 *  1 �� s�� ���� �� 10,000
		 *  s�� ���� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
		 *  
		 */
		
		String[] words= {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		int n = 3;
		
		int[] answer = {0,0};
		HashMap<String, Boolean> map = new HashMap<>();
		map.put(words[0], true);
		
		char startWord;
		char endWord = words[0].charAt(words[0].length()-1);
		
		
		for(int i = 1; i<words.length;i++) {
			startWord = words[i].charAt(0);
			if(startWord != endWord || map.getOrDefault(words[i], false) ) {
				answer[0] = i%n+1;
				answer[1] = i/n+1;
				break;
			}else {
				map.put(words[i], true);
				endWord = words[i].charAt(words[i].length()-1);
			}
		}
		
		
		
	}
}
