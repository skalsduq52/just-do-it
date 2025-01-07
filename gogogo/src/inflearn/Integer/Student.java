package inflearn.Integer;

import java.util.Scanner;

public class Student {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String[] num = sc.nextLine().split(" ");
		
		int temp = Integer.parseInt(num[0]);
		int answer = 1;
		
		for(int i = 1; i<num.length;i++) {
			if(Integer.parseInt(num[i])>temp) {
				answer++;
			}
			temp = Math.max(Integer.parseInt(num[i]),temp);
		}
		
		System.out.println(answer);
		
	}

}
