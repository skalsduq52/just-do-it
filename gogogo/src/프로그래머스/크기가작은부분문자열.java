package 프로그래머스;

public class 크기가작은부분문자열 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서,
		 *  이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.
		 *  
		 *  제한사항
		 *  3 ≤ X, Y의 길이(자릿수) ≤ 3,000,000입니다.
		 *  X, Y는 0으로 시작하지 않습니다.
		 *  X, Y의 짝꿍은 상당히 큰 정수일 수 있으므로, 문자열로 반환합니다.
		 *  
		 *  ※ int 범위의 숫자가 넘어갈 수 있기에 long 타입의 숫자변수 사용!
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
