package inflearn.String;

import java.util.Scanner;

public class FindString {

	/*
	 * ����
		�� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
		��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
	     �Է�
		ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();
        String c = sc.nextLine().toLowerCase();

        int count = 0;

        for( int i = 0 ; i<s.length();i++){
            if(String.valueOf(s.charAt(i)).equals(c) ){
                count++;
            }
        }
        System.out.println(count);

	}
}
