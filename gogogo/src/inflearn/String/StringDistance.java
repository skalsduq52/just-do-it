package inflearn.String;

import java.util.Scanner;

public class StringDistance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word[] = sc.nextLine().split(" ");
		String s = word[0];
		String t = word[1];
		
		int index = s.indexOf(t);
		
		for(int i = 0; i<s.length();i++) {
			if(String.valueOf(s.charAt(i)).equals(t)) {
				System.out.print("0 ");
				index = i;
			}else {
				System.out.print(Math.min(Math.abs(index-i), Math.abs(s.indexOf(t, i) - i))+" ");
			}
		}
		
	}

}
