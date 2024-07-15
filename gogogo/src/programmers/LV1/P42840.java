package programmers.LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class P42840 {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
		 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
		 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
		 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
		 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
		 * 
		 * 제한사항
		 * 시험은 최대 10,000 문제로 구성되어있습니다.
		 * 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
		 * 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.

		 */
		
		int[][] answer = {{1,0},{2,0},{3,0}};
		List<Integer> list = new ArrayList<>();
		
		int one[] = {1,2,3,4,5};
		int two[] = {2,1,2,3,2,4,2,5};
		int three[] = {3,3,1,1,2,2,4,4,5,5};
		
		answer[0][1] = check(one);
		answer[1][1] = check(two);
		answer[2][1] = check(three);
		
		Arrays.sort(answer, new Comparator<int[]>() {
			public int compare(int[] s1, int[] s2) {
				return  s2[1] - s1[1];
			}
		});
		
		list.add(answer[0][0]);
		for(int i=1;i<answer.length;i++) {
			if(answer[i][1]==answer[0][1]) {
				list.add(answer[i][0]);
			}else {
				break;
			}
		}
		
		
	}
	
	public static int check(int[] tester) {
		
		int answers[] = {1, 2, 3, 4, 5};
		int count = 0;
		int tmp = 0;
		
		for(int i = 0; i<answers.length;i++) {
			if (answers[i] == tester[tmp]) count++;
			tmp = tmp>tester.length? 0 : tmp+1;
		}
		
		
		return count;
	}
		
}