package 프로그래머스;

import java.util.*;

public class 숫자짝꿍 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다
		 * (단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다). X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다.
		 *  X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.
		 *  제한사항
		 *  3 ≤ X, Y의 길이(자릿수) ≤ 3,000,000입니다.
		 *  X, Y는 0으로 시작하지 않습니다.
		 *  X, Y의 짝꿍은 상당히 큰 정수일 수 있으므로, 문자열로 반환합니다.
		 *  
		 *  ※ 문제의 제한조건은 300만자리의 범위임. "00"의 값을 지우기위해 integer.parseInt등을 사용할 때 int의 범위가 벗어나면서 오류가 발생함.
		 *   - 전체의 범위를 따지지 않고 숫자의 시작이 0으로 시작한다면 값을 0으로 변경처리함.
		 *  
		 */
		
		int[] x = new int[10];
        int[] y = new int[10];
		
		StringBuilder sb = new StringBuilder();
		
		String X = "99999999999999999999";
		String Y = "99999999999999999999";
	
		for(int i = 0; i<X.length();i++) {
			x[Character.getNumericValue(X.charAt(i))]++;
		}
		for(int i = 0; i<Y.length();i++) {
			y[Character.getNumericValue(Y.charAt(i))]++;
		}
		
		for(int i =9; i>=0;i--) {
			int num = 0;
			num = Math.min(x[i],y[i]);
			sb.append(String.valueOf(i).repeat(num));
		}
	
		String answer = sb.toString();
	
		if(answer.equals("")) answer = "-1";
		if(answer.startsWith("0")) answer = "0";
		
		
	}

}
