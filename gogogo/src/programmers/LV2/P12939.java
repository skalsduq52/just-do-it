package programmers.LV2;

public class P12939 {

	public static void main(String[] args) {

		/*
		 * ����
		 * ���ڿ� s���� �������� ���е� ���ڵ��� ����Ǿ� �ֽ��ϴ�. 
		 * str�� ��Ÿ���� ���� �� �ּҰ��� �ִ밪�� ã�� �̸� "(�ּҰ�) (�ִ밪)"������ ���ڿ��� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
		 * ������� s�� "1 2 3 4"��� "1 4"�� �����ϰ�, "-1 -2 -3 -4"��� "-4 -1"�� �����ϸ� �˴ϴ�.
		 *  
		 *  ���ѻ���
		 *  s���� �� �̻��� ������ �������� ���еǾ� �ֽ��ϴ�.
		 *  
		 */
		
		String s = "1 2 3 4";
		
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		
		String[] numbers = s.split(" ");
		
		for(int i = 0; i<numbers.length;i++) {
			minValue = Math.min(minValue, Integer.parseInt(numbers[i]));
			maxValue = Math.max(maxValue, Integer.parseInt(numbers[i]));
		}
		
		System.out.println(minValue+" "+maxValue);
		
	}
}
