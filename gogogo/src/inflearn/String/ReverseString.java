package inflearn.String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String arr[] = new String[N];
		
		for(int i = 0; i<N;i++) {
			StringBuilder sb = new StringBuilder(sc.next());
			arr[i] = sb.reverse().toString();
		}
		
		
		for(int i = 0; i<N;i++) {
			System.out.println(arr[i]);
		}

	}

}
