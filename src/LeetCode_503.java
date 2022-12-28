import java.util.Arrays;
import java.util.Stack;

public class LeetCode_503 {

    public static int[] nextGreaterElements(int[] a) {
        int n= a.length;
        if(n==1){
            return new int[]{-1};
        }
        Stack<Integer> st = new Stack<Integer>();
        for(int i=n-2;i>=0;i--){
            st.push(a[i]);
        }
//        System.out.println(st);
 int res[]=new int[n];
     for(int i=n-1;i>=0;i--) {
         if (st.isEmpty()) {
             res[i] = -1;
         } else if (!st.isEmpty() && st.peek() > a[i]) {
             res[i] = st.peek();
         }
         else if (st.peek() <= a[i]) {
             while (!st.isEmpty() && st.peek()<=a[i]) {
                 st.pop();
             }
             if (st.isEmpty()) {
                 res[i] = -1;
             } else {
                 res[i] = st.peek();
             }
         }
         st.push(a[i]);
     }
        return res;
    }

    public static void main(String[] args) {
   int[] num ={1,2,3,4,3};
   //2 3 4 -1 4
   int res[]=nextGreaterElements(num);
   System.out.println(Arrays.toString(res));
    }
}
