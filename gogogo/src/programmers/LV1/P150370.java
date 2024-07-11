package programmers.LV1;

import java.util.*;
import java.io.*;

public class P150370 {

	public static void main(String[] args) throws IOException {
		
		
		/*
		 * ����
		 * ���� ��� ���Ǹ� �� ������ 1~n������ �з��Ǵ� �������� n���� �ֽ��ϴ�. ��� ������ ���� ���� ������ �� ������� �������� ���� ��ȿ�Ⱓ�� ������ �ֽ��ϴ�. 
		 * ����� �� ���������� � ������� �����ƴ��� �˰� �ֽ��ϴ�. ������ ���������� ��ȿ�Ⱓ �������� ���� �����ϸ�, ��ȿ�Ⱓ�� �����ٸ� �ݵ�� �ı��ؾ� �մϴ�.
		 * ���� ���, A��� ����� ��ȿ�Ⱓ�� 12 ���̰�, 
		 * 2021�� 1�� 5�Ͽ� ������ ���������� A������� �����Ǿ��ٸ� �ش� ���������� 2022�� 1�� 4�ϱ��� ���� �����ϸ� 2022�� 1�� 5�Ϻ��� �ı��ؾ� �� ���������Դϴ�.
		 * ����� ���� ��¥�� �ı��ؾ� �� �������� ��ȣ���� ���Ϸ� �մϴ�.
		 *  
		 *  
		 */
		
		String today = "2020.01.02";
		
		today = today.replace(".", "");
		String[] terms = {"A 1", "B 11"};
		String[] privacies = {"2019.12.01 A", "2020.01.01 B"};
		List<Integer> list = new ArrayList<>();
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i<terms.length;i++) {
			String[] mapping = terms[i].split(" "); 
			map.put(mapping[0], Integer.valueOf(mapping[1]));
		}
		
		for(int i = 0; i<privacies.length;i++) {
			String[] check = privacies[i].split(" ");
			String[] date = check[0].split("\\.");
			int tmp = map.get(check[1]);
			
			if(tmp>12) {
				date[0] = String.valueOf(Integer.valueOf(date[0])+tmp/12);
				tmp %= 12;
			}
			
			if(Integer.valueOf(date[1])+tmp > 12) {
				date[0] = String.valueOf(Integer.valueOf(date[0])+1);
				date[1] = String.format("%02d",Integer.valueOf(date[1])+tmp-12);
			}else {
				date[1] = String.format("%02d",Integer.valueOf(date[1])+tmp);
			}
			
			if(Integer.valueOf(date[2])-1 == 0) {
				date[0] = date[1].equals("01") ? String.valueOf(Integer.valueOf(date[0])-1) : date[0];
				date[1] = date[1].equals("01") ? "12":String.format("%02d",Integer.valueOf(date[1])-1);
				date[2] = "28";
			}else {
				date[2] =  String.format("%02d", Integer.valueOf(date[2])-1);
			}
			
			String tb = date[0]+date[1]+date[2];
			tb = tb.replace(".", "");
			
			if(Integer.valueOf(today)>Integer.valueOf(tb)) {
				list.add(i+1);
			}
			
			
		}
		
		System.out.println("s");
		
        
	}
		
}