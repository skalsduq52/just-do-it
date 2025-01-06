package inflearn.String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine().toLowerCase();
		StringBuilder sb = new StringBuilder(a);
		String b = sb.reverse().toString();
		
		if(a.equals(b)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
