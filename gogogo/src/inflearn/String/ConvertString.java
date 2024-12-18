package inflearn.String;

import java.util.Scanner;

public class ConvertString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String answer = "";
		
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)>=97) {
				answer+= String.valueOf(s.charAt(i)).toUpperCase();
			}else {
				answer+= String.valueOf(s.charAt(i)).toLowerCase();
			}
		}
		
		
		
		System.out.println(answer);

	}

}
