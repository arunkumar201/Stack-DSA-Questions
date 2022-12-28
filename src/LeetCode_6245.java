public class LeetCode_6245 {

    public static int pivotInteger(int n) {
      if(n==0 || n==1) return 1;
      int total_Sum=n*(n+1)/2;
     int curr_Sum=0;
      for (int i = 1; i <=n;i++) {
          curr_Sum+=i;
          if(curr_Sum==(total_Sum-curr_Sum+i)) return i;
      }
return -1;
    }

    public static void main(String[] args) {
        int n=4;
        int res=pivotInteger(n);
        System.out.println("Final result: " + res);
    }
}
