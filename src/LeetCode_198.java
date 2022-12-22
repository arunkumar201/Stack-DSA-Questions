public class LeetCode_198 {

    public static int rob(int[] a) {
       int n=a.length;
       if(n==1){
           return a[0];
       }
        int max=Integer.MIN_VALUE;
        int sum2=0;
        int include[]=new int[n];
        int exclude[]=new int[n];
        for(int i=0;i<n;i++){
         if(i==0) {
             include[i] = a[i];
             exclude[i] = 0;
         }
         else{
             include[i] =a[i]+exclude[i-1];
             exclude[i] =Math.max(include[i-1],exclude[i-1]);
         }
        }
        return Math.max(exclude[n-1],include[n-1]);
    }

    public static void main(String[] args) {
        int []num={1,2,3,1};
        int res=rob(num);
        System.out.println("Final result is " + res);
    }
}
