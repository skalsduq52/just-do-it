package programmers.LV1;

import java.util.HashMap;

public class P250125 {

	public static void main(String[] args) {

		/*
		 * ����
		 * �� ĭ���� ���� ĥ���� 2���� ���� �������� �ֽ��ϴ�. ���� �� ĭ�� ����� ��, ��, �Ʒ�, ����, ������ ĭ �� ���� ����� ĥ���� ĭ�� ������ ���Ϸ��� �մϴ�.
		 * ������ �� ĭ�� ĥ���� ���� �̸��� ��� ������ ���ڿ� ����Ʈ board�� �� ĭ�� ��ġ�� ��Ÿ���� �� ���� h, w�� �־��� ��
		 * board[h][w]�� �̿��� ĭ�� �� ���� ������ ĥ���� �ִ� ĭ�� ������ return �ϵ��� solution �Լ��� �ϼ��� �ּ���.
		 *  
		 *  ���ѻ���
		 *  1 �� board�� ���� �� 7
		 *  board�� ���̿� board[n]�� ���̴� �����մϴ�.
		 *  0 �� h, w < board�� ����
		 *  1 �� board[h][w]�� ���� �� 10
		 *  board[h][w]�� ���� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
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
