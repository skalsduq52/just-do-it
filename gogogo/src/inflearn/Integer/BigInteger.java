package inflearn.Integer;

import java.util.Scanner;

public class BigInteger {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String[] num = sc.nextLine().split(" ");
		
		int temp = 0;
		
		for(int i = 0; i<num.length;i++) {
			if(Integer.parseInt(num[i])>temp) {
				System.out.print(num[i]+" ");
			}
			temp = Integer.parseInt(num[i]);
		}
		
	}

}
