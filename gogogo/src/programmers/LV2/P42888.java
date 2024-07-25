package programmers.LV2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P42888 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 카카오톡 오픈채팅방에서는 친구가 아닌 사람들과 대화를 할 수 있는데, 본래 닉네임이 아닌 가상의 닉네임을 사용하여 채팅방에 들어갈 수 있다.
		 * 신입사원인 김크루는 카카오톡 오픈 채팅방을 개설한 사람을 위해, 다양한 사람들이 들어오고, 나가는 것을 지켜볼 수 있는 관리자창을 만들기로 했다. 
		 * 채팅방에 누군가 들어오면 다음 메시지가 출력된다.
		 *  
		 *  
		 */
		
		HashMap<String, String> map = new HashMap<>();
		map.put("Enter", "님이 들어왔습니다.");
		map.put("Leave", "님이 나갔습니다.");
		
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
