package inflearn.String;

import java.util.Scanner;

public class StringZip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		char a = s.charAt(0);
		int temp = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i <= s.length();i++) {
			if( a == s.charAt(i)) {
				temp++;
			}else {
				sb.append(a);
				if(temp >1) {
					sb.append(temp);
				}
				a = s.charAt(i);
				temp = 1;
			}
		}
		
		
		System.out.println(sb.toString());
		

	}

}
