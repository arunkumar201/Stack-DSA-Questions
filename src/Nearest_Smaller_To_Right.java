import java.util.Arrays;
import java.util.Stack;

public class Nearest_Smaller_To_Right {

    public static long[] NearestSmallerElementToRightBruteForce(long []a,int n){

        if(n==1){
            return new long[]{-1};
        }
        long result[]=new long[n];
        for(int i=n-1;i>=0;i--){
            result[i]=-1;
            for (int j=i+1;j<n;j++) {
             //1 6 2
                if (a[j] < a[i]) {
                    result[i] = a[j];
                    break;
                }
            }
        }
        return result;
    }

    public static long[] NearestSmallerElementToRightOptimized(long []a,int n){
        if (n == 1) {

            return new long[]{-1};
        }
        long []result=new long[n];
        Stack<Long> st=new Stack<>();

        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                result[i] = -1;
            }
            else if(!st.isEmpty()&& st.peek()<a[i]){
                result[i] =st.peek();
            }
            else if (!st.isEmpty()&& st.peek()>=a[i]){
                while (!st.isEmpty() && st.peek()>=a[i]){
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
         long a[] = {40, 50, 20,10, 60};//Output: [20,10, 10, -1, -1]
//        long a[]={11, 6, 42, 65, 32, 54}; //Output: [6, -1, 32, 32, -1, -1]
//        long a[] = {1,3,2,4}; //output: [1,2,-1,-1]
//        long a[] = {1, 6, 4, 10, 2, 5};//Output: [-1, 4, 2, 2, -1, -1]
//             long[] a = {1, 3, 0, 2, 5}; //output:[-1, 1, -1, 0, 2]
//        long a[]={1, 3, 0, 2, 5}; //output:[0,0,-1,-1,-1]
//            long a[] = {1,6,2}; //output:[-1,2,-1]
            int n = a.length;
            long res1[] =NearestSmallerElementToRightBruteForce(a, n);//NSR
            System.out.println("Final result O(N^2): " + Arrays.toString(res1));
            long res[] =NearestSmallerElementToRightOptimized(a, n);
            System.out.println("Final Answer is using Stack " + Arrays.toString(res));


    }
}
