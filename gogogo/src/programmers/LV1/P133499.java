package programmers.LV1;

import java.util.HashMap;

public class P133499 {

	public static void main(String[] args) {

		/*
		 * ����
		 * �Ӿ��̴� �¾ �� 11���� �� ��ī�� ������ �ֽ��ϴ�. 
		 * ��ī�� ���� "aya", "ye", "woo", "ma" �� ���� ������ �� ���� ������ �����ؼ� ���� �� �ִ� �����ۿ� ���� ���ϰ� �����ؼ� ���� ������ �ϴ� ���� ������մϴ�. 
		 * ���ڿ� �迭 babbling�� �Ű������� �־��� ��, �Ӿ����� ��ī�� ������ �� �ִ� �ܾ��� ������ return�ϵ��� solution �Լ��� �ϼ����ּ���.
		 *  
		 *  ���ѻ���
		 *  1 �� babbling�� ���� �� 100
		 *  1 �� babbling[i]�� ���� �� 30
		 *  ���ڿ��� ���ĺ� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
		 *  
		 */
		
		String babbling[] = {"ayayemaaya"};
		String pron[] = {"aya", "ye", "woo", "ma"};
		String hh[] = {"ayaaya", "yeye", "woowoo", "mama"};
		HashMap<String,Boolean> map = new HashMap<>();
		
		for(int i =0; i<pron.length;i++) {
			map.put(pron[i], false);
		}
		
		int answer = 0;
		
		for(int i =0 ;i<babbling.length;i++) {
			String babble = babbling[i];
			for(int j =0; j<pron.length;j++) {
					babble = babble.replaceAll(hh[j], "0").replaceAll(pron[j], " ");
			}
			babble = babble.replace(" ", "");
			if(babble.length()  == 0) answer++;
		}
		System.out.println(answer);
		
		
	}
}
