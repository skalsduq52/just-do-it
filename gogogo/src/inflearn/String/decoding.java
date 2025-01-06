package inflearn.String;

import java.util.Scanner;

public class decoding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String s = sc.next();
		
		for(int i = 0; i < 7 * a; i+=7) {
			String temp = s.substring(i, i+7);
			temp = temp.replaceAll("#", "1");
			temp = temp.replaceAll("\\*", "0");
			System.out.print(Character.toString(Integer.parseInt(temp,2)));
		}
		

	}

}
