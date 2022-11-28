import java.util.Stack;

public class LeetCode_907 {
    public  static int sumSubarrayMins_BruteForce(int[] a) {
        int n=a.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return a[0];
        }
        int MinSum=0;
        int temp=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++) {
                temp = Math.min(temp, a[j]);
                MinSum+=temp;
                MinSum=MinSum%1000000007;

            }
            temp=Integer.MAX_VALUE;
        }
        return MinSum%(1000000007);
    }

    public static int  sumSubarrayMins(int[] a){
        int n=a.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return a[0];
        }
        Stack<Integer> st=new Stack<>();
        int MinSum=0;
        int temp=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(a[i]);
                MinSum+=a[i];
            }
            else if(!st.isEmpty() && st.peek()>a[i]){
                MinSum+=(n-i-1)*a[i]+a[i];
                st.push(a[i]);
            }
            else  if(!st.isEmpty() && st.peek()<=a[i]){
                MinSum+=(n-i-1)*st.peek()+a[i];
                 st.push(a[i]);
            }
        }
        return MinSum;
    }
    public static void main(String[] args) {
//        int a[]={3,1,2,4};  //ans=17
        int a[]={11,81,94,43,3}; //ans=444
//        int a[]={3,1,8,4,5,8}; //63
        //We need to find out the sum minimum element in each contiguous subarray
        int res=sumSubarrayMins(a);
        System.out.println("Final result: " + res);
    }
}
