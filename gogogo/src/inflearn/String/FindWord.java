package inflearn.String;

import java.util.Scanner;

public class FindWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String arr[] = s.split(" ");
		int rank = 0;
		int size = 0;
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i].length()>size) {
				size = arr[i].length();
				rank = i;
			}
		}
		
		System.out.println(arr[rank]);
		
	}

}
