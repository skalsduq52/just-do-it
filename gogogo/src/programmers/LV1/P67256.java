package programmers.LV1;

import java.util.HashMap;

// 키패드 누르기
public class P67256 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand = "right";
		StringBuilder sb = new StringBuilder();
		
		HashMap<String,Integer[]> map = new HashMap<>(); 
		
		map.put("1", new Integer[] {0,0});
		map.put("2", new Integer[] {0,1});
		map.put("3", new Integer[] {0,2});
		map.put("4", new Integer[] {1,0});
		map.put("5", new Integer[] {1,1});
		map.put("6", new Integer[] {1,2});
		map.put("7", new Integer[] {2,0});
		map.put("8", new Integer[] {2,1});
		map.put("9", new Integer[] {2,2});
		map.put("*", new Integer[] {3,0});
		map.put("0", new Integer[] {3,1});
		map.put("#", new Integer[] {3,2});
		
		Integer[] L = map.get("*");
		Integer[] R = map.get("#");
		Integer[] tmp = null;
		
		
		for(int i = 0; i<numbers.length;i++) {
			if(numbers[i]%3 == 1) {
				sb.append("L");
				L = map.get(String.valueOf(numbers[i]));
			}else if(numbers[i]%3 == 0&&numbers[i]!=0) {
				sb.append("R");
				R = map.get(String.valueOf(numbers[i]));
			}else {
				tmp = map.get(String.valueOf(numbers[i]));
				int lCount = 0;
				int rCount = 0;
				lCount = Math.abs(L[0]-tmp[0])+Math.abs(L[1]-tmp[1]);
				rCount = Math.abs(R[0]-tmp[0])+Math.abs(R[1]-tmp[1]);
				if(lCount>rCount||(hand.equals("right")&&lCount==rCount)) {
					R = map.get(String.valueOf(numbers[i]));
					sb.append("R");
				}else if(rCount > lCount||(hand.equals("left")&&lCount==rCount)) {
					L = map.get(String.valueOf(numbers[i]));
					sb.append("L");
				}
			}
		}
		
        	
	}
		
}