package programmers.LV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class P154539 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 정수로 이루어진 배열 numbers가 있습니다. 
		 * 배열 의 각 원소들에 대해 자신보다 뒤에 있는 숫자 중에서 자신보다 크면서 가장 가까이 있는 수를 뒷 큰수라고 합니다.
		 * 정수 배열 numbers가 매개변수로 주어질 때, 모든 원소에 대한 뒷 큰수들을 차례로 담은 배열을 return 하도록 solution 함수를 완성해주세요. 
		 * 단, 뒷 큰수가 존재하지 않는 원소는 -1을 담습니다.
		 *  
		 *  제한사항
		 *  4 ≤ numbers의 길이 ≤ 1,000,000
		 *  1 ≤ numbers[i] ≤ 1,000,000
		 *  
		 */
		
		int numbers[] = {9, 1, 5, 3, 6, 2};
		int answer[] = new int[numbers.length];
		Arrays.fill(answer, -1);
		
		Stack<Integer> st = new Stack<>();		
		
		for (int i = numbers.length-1; i>=0;i--) {
			while (!st.empty() && numbers[i] >= st.peek()){
                st.pop();
            }
			
			if(!st.empty()){
                answer[i] = st.peek();
            }
			st.push(numbers[i]);
		}
	}
}
