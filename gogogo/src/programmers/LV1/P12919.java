package programmers.LV1;

import java.util.Arrays;

public class P12919 {
	/*
	 * String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, 
	 * solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다
	 * seoul은 길이 1 이상, 1000 이하인 배열입니다.
	 * seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
     * "Kim"은 반드시 seoul 안에 포함되어 있습니다.
	 * seoul	        return
     * ["Jane", "Kim"]	"김서방은 1에 있다"
	 * 
	 */

	public static void main(String[] args) {
		
		String[] seoul = {"Jane", "Kim"};
		String answer = "";
		
		for(int i = 0; i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 "+i+"에 있다";
                break;
            }    
        }
		
	}
	
	
	/* 
	 * 반복문을 통해 문자열을 비교할 경우 break 문을 통해 끝까지 반복문이 돌지 않도록 하자.
	 * Arrays.asList()를 통해 리스트로 변경한 후 indexOf를 사용할 수도 있음.
	*/
	
}
