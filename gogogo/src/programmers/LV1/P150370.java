package programmers.LV1;

import java.util.*;
import java.io.*;

public class P150370 {

	public static void main(String[] args) throws IOException {
		
		
		/*
		 * 문제
		 * 고객의 약관 동의를 얻어서 수집된 1~n번으로 분류되는 개인정보 n개가 있습니다. 약관 종류는 여러 가지 있으며 각 약관마다 개인정보 보관 유효기간이 정해져 있습니다. 
		 * 당신은 각 개인정보가 어떤 약관으로 수집됐는지 알고 있습니다. 수집된 개인정보는 유효기간 전까지만 보관 가능하며, 유효기간이 지났다면 반드시 파기해야 합니다.
		 * 예를 들어, A라는 약관의 유효기간이 12 달이고, 
		 * 2021년 1월 5일에 수집된 개인정보가 A약관으로 수집되었다면 해당 개인정보는 2022년 1월 4일까지 보관 가능하며 2022년 1월 5일부터 파기해야 할 개인정보입니다.
		 * 당신은 오늘 날짜로 파기해야 할 개인정보 번호들을 구하려 합니다.
		 *  
		 *  
		 */
		
		String today = "2020.01.02";
		
		today = today.replace(".", "");
		String[] terms = {"A 1", "B 11"};
		String[] privacies = {"2019.12.01 A", "2020.01.01 B"};
		List<Integer> list = new ArrayList<>();
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i<terms.length;i++) {
			String[] mapping = terms[i].split(" "); 
			map.put(mapping[0], Integer.valueOf(mapping[1]));
		}
		
		for(int i = 0; i<privacies.length;i++) {
			String[] check = privacies[i].split(" ");
			String[] date = check[0].split("\\.");
			int tmp = map.get(check[1]);
			
			if(tmp>12) {
				date[0] = String.valueOf(Integer.valueOf(date[0])+tmp/12);
				tmp %= 12;
			}
			
			if(Integer.valueOf(date[1])+tmp > 12) {
				date[0] = String.valueOf(Integer.valueOf(date[0])+1);
				date[1] = String.format("%02d",Integer.valueOf(date[1])+tmp-12);
			}else {
				date[1] = String.format("%02d",Integer.valueOf(date[1])+tmp);
			}
			
			if(Integer.valueOf(date[2])-1 == 0) {
				date[0] = date[1].equals("01") ? String.valueOf(Integer.valueOf(date[0])-1) : date[0];
				date[1] = date[1].equals("01") ? "12":String.format("%02d",Integer.valueOf(date[1])-1);
				date[2] = "28";
			}else {
				date[2] =  String.format("%02d", Integer.valueOf(date[2])-1);
			}
			
			String tb = date[0]+date[1]+date[2];
			tb = tb.replace(".", "");
			
			if(Integer.valueOf(today)>Integer.valueOf(tb)) {
				list.add(i+1);
			}
			
			
		}
		
		System.out.println("s");
		
        
	}
		
}