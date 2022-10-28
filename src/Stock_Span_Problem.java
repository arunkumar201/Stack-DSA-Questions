import java.util.Arrays;
import java.util.Stack;

public class Stock_Span_Problem {

    static int[] Stock_Span_Problem1(int[]a,int n){
        if(n==1){
            return new int[] {1};
        }
        int span[]=new int[n];
        Stack<Integer> st=new Stack();
        st.push(0);
        span[0]=1;
        for(int i=1;i<n;i++) {
            while(!st.isEmpty() && a[i]<=a[st.peek()]) {
                 st.pop();
            }
             if(st.isEmpty()) {
                span[i] = i + 1;
            } else{
                    span[i] = i-st.peek();
                }
              st.push(i);
        }
         return span;

    }


    public static void main(String[] args) {
//        long a[] = {40, 50, 20,10, 60};//Output: [20,10, 10, -1, -1]
//        long a[]={11, 6, 42, 65, 32, 54}; //Output: [6, -1, 32, 32, -1, -1]
//        long a[] = {1,3,2,4}; //output: [1,2,-1,-1]
//        long a[] = {1, 6, 4, 10, 2, 5};//Output: [-1, 4, 2, 2, -1, -1]
//             long[] a = {1, 3, 0, 2, 5}; //output:[-1, 1, -1, 0, 2]
//        long a[]={1, 3, 0, 2, 5}; //output:[0,0,-1,-1,-1]
            int a[] = {1,1,2}; //output:[1,2,1]
        int n = a.length;
        int res[] =Stock_Span_Problem1(a, n); //nearestGreaterElement_to left
        System.out.println("Final Answer is using Stack " + Arrays.toString(res));


    }
}
