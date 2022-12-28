import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class LeetCode_496 {



    public static int[] nextGreaterElement(int[] arr1, int[] arr2) {
      int n1=arr1.length;
      int n2=arr2.length;
      if(n1==0){
          return new int[]{-1};
      }
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n2;i++){
            while(!st.isEmpty() && st.peek()<arr2[i]) {
                mp.put(st.pop(), arr2[i]);
            }
            st.push(arr2[i]);
            }
        for(int i = 0; i < n1; i++){
          arr1[i]=mp.getOrDefault(arr1[i],-1);
        }
        return arr1;
    }

    public static void main(String[] args) {
        int a1[]={4,1,2};
        int a2[]={1,3,4,2};
        int[] res=nextGreaterElement(a1, a2);
        System.out.println("Final result is " + Arrays.toString(res));
    }
}
