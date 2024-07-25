package programmers.LV2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P42888 {

	public static void main(String[] args) {

		/*
		 * ����
		 * īī���� ����ä�ù濡���� ģ���� �ƴ� ������ ��ȭ�� �� �� �ִµ�, ���� �г����� �ƴ� ������ �г����� ����Ͽ� ä�ù濡 �� �� �ִ�.
		 * ���Ի���� ��ũ��� īī���� ���� ä�ù��� ������ ����� ����, �پ��� ������� ������, ������ ���� ���Ѻ� �� �ִ� ������â�� ������ �ߴ�. 
		 * ä�ù濡 ������ ������ ���� �޽����� ��µȴ�.
		 *  
		 *  
		 */
		
		HashMap<String, String> map = new HashMap<>();
		map.put("Enter", "���� ���Խ��ϴ�.");
		map.put("Leave", "���� �������ϴ�.");
		
		String record[] = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i<record.length;i++) {
			StringBuilder sb = new StringBuilder();
			
			String[] info = record[i].split(" ");
			
			if(!info[0].equals("Leave")) {
				map.put(info[1], info[2]);
				
			}
			
			if(!info[0].equals("Change")) {
				sb.append(info[1]+" ");
				sb.append(info[0]);
				list.add(sb.toString());
			}
			
		}
		
		String answer[] = new String[list.size()];
		for(int j = 0; j<list.size();j++) {
			String[] pars = list.get(j).split(" ");
			StringBuilder sb = new StringBuilder();
			for(int k = 0;k<pars.length;k++) {
				sb.append(map.get(pars[k]));
			}
			answer[j] = sb.toString();
		}
		
		
	}
}
