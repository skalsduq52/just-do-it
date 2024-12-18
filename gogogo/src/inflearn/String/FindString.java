package inflearn.String;

import java.util.Scanner;

public class FindString {

	/*
	 * 설명
		한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
		대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
	     입력
		첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();
        String c = sc.nextLine().toLowerCase();

        int count = 0;

        for( int i = 0 ; i<s.length();i++){
            if(String.valueOf(s.charAt(i)).equals(c) ){
                count++;
            }
        }
        System.out.println(count);

	}
}
