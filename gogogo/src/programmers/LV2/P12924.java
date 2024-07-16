package programmers.LV2;

public class P12924 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다. 
		 * 예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.
		 * 1 + 2 + 3 + 4 + 5 = 15
		 * 4 + 5 + 6 = 15
		 * 7 + 8 = 15
		 * 15 = 15
		 *  
		 *  제한사항
		 *  n은 1,000,000 이하의 자연수 입니다.
		 *  
		 */
		
		int n = 15;
		int answer = 0;
		
		for(int i = 1; i<=n;i++) {
			int tmp = i;
			int count = i+1;
			while(tmp<=n) {
				if(tmp==n) {
					answer++;
					break;
				} 
				tmp += count;
				count++;
			}
		}
		
		
	}
}
