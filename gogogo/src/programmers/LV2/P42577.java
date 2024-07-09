package programmers.LV2;

import java.util.Arrays;
import java.util.HashMap;

public class P42577 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
		 * 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
		 *  
		 *  제한사항
		 *  phone_book의 길이는 1 이상 1,000,000 이하입니다.
		 *  각 전화번호의 길이는 1 이상 20 이하입니다.
		 *  같은 전화번호가 중복해서 들어있지 않습니다.
		 */
		
		String[] phone_book = {"12","123","1235","567","88"};
		boolean answer = true;
		
		Arrays.sort(phone_book);
		
		for (int i = 0; i < phone_book.length - 1; i++) {
            String s = phone_book[i];
            if (phone_book[i + 1].startsWith(s)) {
                answer =  false;
            }
        }

		System.out.println(answer);
		
		
	}
}
