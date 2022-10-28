import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Left {
  public static long[] nextLargerElementToLeftBruteForce(long[] a,int n){
   if(n==1){
       return new long[]{-1};
   }
   long result[] =new long[n];

   for(int i=n-1;i>=0;i--) {
       result[i] = -1;
       for (int j = i - 1; j >= 0; j--) {
           if (a[j] > a[i]) {
               result[i] = a[j];
               break;
           }
       }
   }
       return result;
   }

   public static long[] nextLargerElementToLeftOptimized(long[] a, int n){
        if(n==1){
            return new long[]{-1};
        }
        Stack<Long> st=new Stack<>();
        long result[]=new long[n];
        for(int i=0;i<n;i++){

            if(st.isEmpty()){
                result[i] = -1;
            }
            else if(!st.isEmpty() && st.peek()>a[i]){
                result[i]=st.peek();
            }
            else if(!st.isEmpty() && st.peek()<=a[i]){
                while (!st.isEmpty() && st.peek()<=a[i]) {
                    st.pop();
                }
                if(st.isEmpty()){
                    result[i] = -1;
                }
                else{
                    result[i]=st.peek();
                }
            }
            st.push(a[i]);
        }
        return result;

    }
    public static void main(String[] args) {
//            long a[] = {40, 50, 20,10, 60};//Output: [-1, -1, 50, 20, -1]
//        long a[]={11, 6, 42, 65, 32, 54}; //Output: [-1, 11, -1, -1, 65, 65]
//        long a[] = {1,3,2,4}; //output: [-1, -1, 3,-1]
        long a[] = {1, 6, 4, 10, 2, 5};//Output: [-1, -1, 6, -1, 10, 10]

        int n = a.length;
            long res1[] = nextLargerElementToLeftBruteForce(a, n);
            System.out.println("Final result O(N^2): " + Arrays.toString(res1));
            long res[] = nextLargerElementToLeftOptimized(a, n);
            System.out.println("Final Answer is using Stack " + Arrays.toString(res));

    }
}
