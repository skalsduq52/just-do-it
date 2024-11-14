class Solution {
    boolean solution(String s) {
        boolean answer = false;
        
        int num = 1;

        if(s.charAt(0)==')'){
            return false;
        }else{
            for(int i = 1; i<s.length();i++){
                if(s.charAt(i)=='('){
                    num++;
                }else{
                    num--;
                    if (num<0)
                        return false;
                }
            }
        }
        
        if(num == 0)
            answer = true;

        return answer;
    }
}
