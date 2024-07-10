package programmers.LV1;

import java.util.HashMap;

public class P161990 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 컴퓨터 바탕화면은 각 칸이 정사각형인 격자판입니다. 
		 * 이때 컴퓨터 바탕화면의 상태를 나타낸 문자열 배열 wallpaper가 주어집니다. 
		 * 파일들은 바탕화면의 격자칸에 위치하고 바탕화면의 격자점들은 바탕화면의 가장 왼쪽 위를 (0, 0)으로 시작해 (세로 좌표, 가로 좌표)로 표현합니다. 
		 * 빈칸은 ".", 파일이 있는 칸은 "#"의 값을 가집니다. 드래그를 하면 파일들을 선택할 수 있고, 선택된 파일들을 삭제할 수 있습니다. 
		 * 머쓱이는 최소한의 이동거리를 갖는 한 번의 드래그로 모든 파일을 선택해서 한 번에 지우려고 하며 드래그로 파일들을 선택하는 방법은 다음과 같습니다.
		 *  
		 *  제한사항
		 *  1 ≤ s의 길이 ≤ 10,000
		 *  s는 영어 소문자로만 이루어져 있습니다.
		 *  
		 */
		
		String[] wallpaper = {".#...", "..#..", "...#."};
		int answer[] = new int[4];
		answer[0] = 999;
		answer[1] = 999;
		answer[2] = -1;
		answer[3] = -1;
		
		for(int i = 0; i<wallpaper.length;i++) {
			int tmp = wallpaper[i].indexOf("#");
			if(tmp>=0) {
				answer[0] = Math.min(answer[0], i);
				answer[1] = Math.min(answer[1], tmp);
				answer[2] = Math.max(answer[2], i+1);
				answer[3] = Math.max(answer[3], wallpaper[i].lastIndexOf("#")+1);
			}
		}
		
		
		
	}
}
