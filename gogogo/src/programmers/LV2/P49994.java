package programmers.LV2;

import java.util.HashSet;

public class P49994 {
	
	static int L = 5;
	static int R = 5;
	static int answer = 0;
	static HashSet<String> set = new HashSet<>();
	
	public static void main(String[] args) {


		/*
		 * 문제
		 * 게임 캐릭터를 4가지 명령어를 통해 움직이려 합니다. 명령어는 다음과 같습니다.
		 * U: 위쪽으로 한 칸 가기
		 * D: 아래쪽으로 한 칸 가기
		 * R: 오른쪽으로 한 칸 가기
		 * L: 왼쪽으로 한 칸 가기
		 *  
		 *  제한사항
		 *  dirs는 string형으로 주어지며, 'U', 'D', 'R', 'L' 이외에 문자는 주어지지 않습니다
		 *  dirs의 길이는 500 이하의 자연수입니다.
		 *  
		 */
		
		String dirs = "RRRRRRRRRRRRRRRRRRRRRUUUUUUUUUUUUULU";
		
		for(int i = 0; i<dirs.length();i++) {
			switch(dirs.charAt(i)) {
				case 'U' : check(0,-1); break;
				case 'D' : check(0,1); break;
				case 'L' : check(-1,0); break;
				case 'R' : check(1,0); break;
			}
		}
		
		System.out.println(set.size());
		
	}
	
	public static void check(int X, int Y) {
		
		StringBuilder sb= new StringBuilder();
		StringBuilder sb2= new StringBuilder();
		
		sb.append(L);
		sb.append(R);
		
		if(L+X > 10) {
			L = 10;
		}else if(L+X < 0) {
			L = 0;
		}else {
			L = L+X;
		}
		
		if(R > 10) {
			R = 10;
		}else if(R+Y < 0) {
			R = 0;
		}else {
			R = R+Y;
		}
		
		if(sb.toString().equals(L+""+R)) return;
		
		sb2.append(String.format("%02d",Math.min(Integer.valueOf(sb.toString()), Integer.valueOf(L+""+R))));
		sb2.append(String.format("%02d",Math.max(Integer.valueOf(sb.toString()), Integer.valueOf(L+""+R))));
		
		System.out.println(sb2.toString());
		
		set.add(sb2.toString());
	}
}
