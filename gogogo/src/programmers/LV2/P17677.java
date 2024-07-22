package programmers.LV2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class P17677 {

	public static void main(String[] args) {

		/*
		 * ����
		 * ��ī�� ���絵�� ���� ���� ���絵�� �˻��ϴ� ���� ��� ���� �ϳ��� �˷��� �ִ�. 
		 * �� ���� A, B ������ ��ī�� ���絵 J(A, B)�� �� ������ ������ ũ�⸦ �� ������ ������ ũ��� ���� ������ ���ǵȴ�.
		 * ���� ��� ���� A = {1, 2, 3}, ���� B = {2, 3, 4}��� �� ��, ������ A �� B = {2, 3}, ������ A �� B = {1, 2, 3, 4}�� �ǹǷ�, 
		 * ���� A, B ������ ��ī�� ���絵 J(A, B) = 2/4 = 0.5�� �ȴ�. ���� A�� ���� B�� ��� �������� ��쿡�� �������� ���ǵ��� ������ ���� J(A, B) = 1�� �����Ѵ�.
		 *  
		 */
		
		
		String str1 = "FRANCE";
		String str2 = "french";
		
		ArrayList<String> list1 = new ArrayList<>(toList(str1));
		ArrayList<String> list2 = new ArrayList<>(toList(str2));
		
		
		ArrayList<String> list3 = new ArrayList<>(list1);
		
		for(String s : list2) list3.remove(s);
		
		
		int and = list1.size()-list3.size(); //������ ����
        int sum = list2.size()+list3.size(); //������ ����
		
		System.out.println("");
		
		
	}
	
	public static ArrayList<String> toList(String str){
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i<str.length()-1;i++) {
			String temp = str.substring(i,i+2).toLowerCase();
			if(temp.matches("[a-zA-Z]+")) {
				list.add(temp);
			}
			
		}
		
		return list;
	}
}
