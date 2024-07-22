package programmers.LV2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class P17677 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 자카드 유사도는 집합 간의 유사도를 검사하는 여러 방법 중의 하나로 알려져 있다. 
		 * 두 집합 A, B 사이의 자카드 유사도 J(A, B)는 두 집합의 교집합 크기를 두 집합의 합집합 크기로 나눈 값으로 정의된다.
		 * 예를 들어 집합 A = {1, 2, 3}, 집합 B = {2, 3, 4}라고 할 때, 교집합 A ∩ B = {2, 3}, 합집합 A ∪ B = {1, 2, 3, 4}이 되므로, 
		 * 집합 A, B 사이의 자카드 유사도 J(A, B) = 2/4 = 0.5가 된다. 집합 A와 집합 B가 모두 공집합일 경우에는 나눗셈이 정의되지 않으니 따로 J(A, B) = 1로 정의한다.
		 *  
		 */
		
		
		String str1 = "FRANCE";
		String str2 = "french";
		
		ArrayList<String> list1 = new ArrayList<>(toList(str1));
		ArrayList<String> list2 = new ArrayList<>(toList(str2));
		
		
		ArrayList<String> list3 = new ArrayList<>(list1);
		
		for(String s : list2) list3.remove(s);
		
		
		int and = list1.size()-list3.size(); //교집합 갯수
        int sum = list2.size()+list3.size(); //합집합 갯수
		
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
