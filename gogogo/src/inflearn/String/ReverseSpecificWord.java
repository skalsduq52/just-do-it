package inflearn.String;

import java.util.Scanner;

public class ReverseSpecificWord {

	
//	���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,
//	Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.

//	�����Է�			�������
//	a#b!GE*T@S		S#T!EG*b@a


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = "a#b!GE*T@S";
		String b = a.replaceAll("[^a-zA-Z]","");
		
		a = a.replaceAll("[a-zA-Z]", " ");
		char[] word = a.toCharArray();
		
		System.out.println(a);
		System.out.println(b);
		
		
		

	}

}
