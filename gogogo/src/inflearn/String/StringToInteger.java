package inflearn.String;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		a = a.replaceAll("[^0-9]", "");
		
		int answer = Integer.valueOf(a);
		
		System.out.println(answer);

	}

}
