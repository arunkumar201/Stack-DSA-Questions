import java.util.Arrays;
import java.util.Stack;

public class LeetCode_2454 {
  //Brute Force Approach
    //O(N^2)
    public static int[] secondGreaterElement_BruteForce(int[] a) {
        int n = a.length;
        if(n==1){
            return new int[]{-1};
        }
        int res[]=new int[n];
          int flag=0;
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                if(a[j]>a[i] && flag==0){
                   flag=1;

                }
              else if(a[j]>a[i] && flag==1){
                    res[i]=a[j];
                    break;
                }
              else{
                  res[i]=-1;
                }
            }
            flag=0;
        }
        res[n-1]=-1;
        return res;
    }


    public static int[] secondGreaterElement(int[] a){
        int n=a.length;
        int res[]=new int[n];
        int flag=0;
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        Stack<Integer> st3=new Stack<>();




        return res;

}

    public static void main(String[] args) {
     int a[]={2,4,0,9,6};
    int res[]=secondGreaterElement(a);
        System.out.println("Final result is " + Arrays.toString(res));
    }
}
