package programmers.LV2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class P92341 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 주차 요금을 나타내는 정수 배열 fees, 자동차의 입/출차 내역을 나타내는 문자열 배열 records가 매개변수로 주어집니다. 
		 * 차량 번호가 작은 자동차부터 청구할 주차 요금을 차례대로 정수 배열에 담아서 return 하도록 solution 함수를 완성해주세요.
		 *  
		 *  
		 */
		
		int[] fees = {180, 5000, 10, 600};
		String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		HashMap<String, Integer> time = new HashMap<>();
		HashMap<String, String> IOMap = new HashMap<>();
		
		for(int i = 0; i<records.length;i++) {
			String[] info = records[i].split(" ");
			
			if(info[2].equals("IN")) {
				IOMap.put(info[1], info[0]);
			}else {
				int min = 0;
				
				String in[] = IOMap.get(info[1]).split(":");
				String out[] = info[0].split(":");
				
				int outTime = Integer.valueOf(out[0]) * 60 + Integer.valueOf(out[1]);
				int inTime = Integer.valueOf(in[0]) * 60 + Integer.valueOf(in[1]);
				
				min += outTime - inTime ;
				
				time.put(info[1], time.getOrDefault(info[1],0)+min);
				
				IOMap.remove(info[1]);
			}
			
		}
		for(Map.Entry<String, String> map : IOMap.entrySet()) {
			int min = 0;
			
			String in[] = IOMap.get(map.getKey()).split(":");
			
			int outTime = 1439;
			int inTime = Integer.valueOf(in[0]) * 60 + Integer.valueOf(in[1]);
			
			min += outTime - inTime;
			time.put(map.getKey(), time.getOrDefault(map.getKey(),0)+min);
			
		}
		
		Map<String,Integer> sortedMap = new TreeMap<>(time);
		
		int answer[] = new int[sortedMap.size()];
		int i= 0;
		for(Map.Entry<String, Integer> map : sortedMap.entrySet()) {
			int temp = map.getValue();
			if(temp>fees[0]) {
				temp -= fees[0];
				answer[i] = fees[1] + (int)Math.ceil((double)temp/fees[2]) * fees[3];
				System.out.println(answer[i]);
			}else {
				answer[i] = fees[1];
			}
			i++;
		}
		
		
		
	}
}
