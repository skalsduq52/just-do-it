package ���α׷��ӽ�;

public class ũ�Ⱑ�����κй��ڿ� {

	public static void main(String[] args) {

		/*
		 * ����
		 * ���ڷ� �̷���� ���ڿ� t�� p�� �־��� ��, t���� p�� ���̰� ���� �κй��ڿ� �߿���,
		 *  �� �κй��ڿ��� ��Ÿ���� ���� p�� ��Ÿ���� ������ �۰ų� ���� ���� ������ Ƚ���� return�ϴ� �Լ� solution�� �ϼ��ϼ���.
		 *  
		 *  ���ѻ���
		 *  3 �� X, Y�� ����(�ڸ���) �� 3,000,000�Դϴ�.
		 *  X, Y�� 0���� �������� �ʽ��ϴ�.
		 *  X, Y�� ¦���� ����� ū ������ �� �����Ƿ�, ���ڿ��� ��ȯ�մϴ�.
		 *  
		 *  �� int ������ ���ڰ� �Ѿ �� �ֱ⿡ long Ÿ���� ���ں��� ���!
		 *  
		 */
		
		String t = "500220839878";
        String p = "7";
        
        long count = 0;
        
        for(int i = 0; i<= t.length()-p.length();i++) {
        	Long num = Long.parseLong(t.substring(i,p.length()+i));
        	if(Long.parseLong(p) >= num ) {
        		count++;
        	}
        }
		System.out.println(count);
		
	}
}
