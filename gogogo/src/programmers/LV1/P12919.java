package programmers.LV1;

import java.util.Arrays;

public class P12919 {
	/*
	 * String�� �迭 seoul�� element�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"�� String�� ��ȯ�ϴ� �Լ�, 
	 * solution�� �ϼ��ϼ���. seoul�� "Kim"�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�
	 * seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
	 * seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
     * "Kim"�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
	 * seoul	        return
     * ["Jane", "Kim"]	"�輭���� 1�� �ִ�"
	 * 
	 */

	public static void main(String[] args) {
		
		String[] seoul = {"Jane", "Kim"};
		String answer = "";
		
		for(int i = 0; i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                answer = "�輭���� "+i+"�� �ִ�";
                break;
            }    
        }
		
	}
	
	
	/* 
	 * �ݺ����� ���� ���ڿ��� ���� ��� break ���� ���� ������ �ݺ����� ���� �ʵ��� ����.
	 * Arrays.asList()�� ���� ����Ʈ�� ������ �� indexOf�� ����� ���� ����.
	*/
	
}
