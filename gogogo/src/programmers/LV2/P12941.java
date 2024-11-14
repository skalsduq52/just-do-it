import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int num = 0;
        Queue<Integer> que = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack();

        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i<A.length;i++){
            que.add(A[i]);
            stack.add(B[i]);
        }

        for(int i = 0; i<A.length;i++) {
            int a= que.poll();
            int b= stack.pop();

            num += a*b;
        }
        
        return num;
    }
}
