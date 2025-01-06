package inflearn.String;

import java.util.Scanner;

public class ReverseSpecificWord {

	
//	영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
//	특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

//	예시입력			예시출력
//	a#b!GE*T@S		S#T!EG*b@a


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = "a#b!GE*T@S";
		String b = a.replaceAll("[^a-zA-Z]","");
		
		a = a.replaceAll("[a-zA-Z]", " ");
		char[] word = a.toCharArray();
		
		System.out.println(a);
		System.out.println(b);
		
		
		

	}

}
