package programmers.LV1;

import java.util.*;
import java.io.*;

public class P64061 {

	public static void main(String[] args) throws IOException {
		
		int[][] board = {{0,0,0,0,0},
						 {0,0,1,0,3},
						 {0,2,5,0,1},
						 {4,2,4,4,2},
						 {3,5,1,3,1}};
		
		int[] moves = {1,5,3,5,1,2,1,4};
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i =0;i<moves.length;i++) {
			int num = stack.isEmpty()? 0 : stack.peek();
			for(int j = 0; j<board.length;j++) {
				if(board[j][moves[i]-1]==0) {
					continue;
				}else {
					if(num == board[j][moves[i]-1]) {
						stack.pop();
						answer+=2;
					}else {
						stack.add(board[j][moves[i]-1]);
					}
					board[j][moves[i]-1] = 0;
					break;
				} 
			}
		}
		
        
	}
		
}