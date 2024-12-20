package programmers.LV1;

import java.util.HashMap;

public class P250125 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 각 칸마다 색이 칠해진 2차원 격자 보드판이 있습니다. 그중 한 칸을 골랐을 때, 위, 아래, 왼쪽, 오른쪽 칸 중 같은 색깔로 칠해진 칸의 개수를 구하려고 합니다.
		 * 보드의 각 칸에 칠해진 색깔 이름이 담긴 이차원 문자열 리스트 board와 고른 칸의 위치를 나타내는 두 정수 h, w가 주어질 때
		 * board[h][w]와 이웃한 칸들 중 같은 색으로 칠해져 있는 칸의 개수를 return 하도록 solution 함수를 완성해 주세요.
		 *  
		 *  제한사항
		 *  1 ≤ board의 길이 ≤ 7
		 *  board의 길이와 board[n]의 길이는 동일합니다.
		 *  0 ≤ h, w < board의 길이
		 *  1 ≤ board[h][w]의 길이 ≤ 10
		 *  board[h][w]는 영어 소문자로만 이루어져 있습니다.
		 *  
		 */
		
		int answer = 0;
		String[][] board = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
		int h = 1;
		int w = 1;
		
		int[][] position = {{0, -1},{0,1},{-1,0},{1,0}};
		
		String color = board[h][w];
		
		for(int direction[] : position) {
			int hh = h+direction[0];
			int ww = w+direction[1];
			
			if(hh>=0&&hh<board.length&&ww>=0&&ww<board.length) {
				if(color.equals(board[hh][ww])) answer++;
			}
			
		}
		
		
		System.out.println(answer);
		
		
		
		
		
	}
}
