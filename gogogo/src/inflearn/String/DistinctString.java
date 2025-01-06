package inflearn.String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		Set<Character> set = new LinkedHashSet<>();
		
		for(int i = 0; i <s.length();i++) {
			set.add(s.charAt(i));
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(char word : set) {
			sb.append(word);
		}
		
		System.out.println(sb.toString());
	}

}
