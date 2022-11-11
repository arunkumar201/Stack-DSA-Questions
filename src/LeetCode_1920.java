import java.util.Arrays;
/*
Given a zero-based permutation nums (0-indexed),
build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length
and return it.
A zero-based permutation nums is an array of distinct integers
 from 0 to nums.length - 1 (inclusive).
 */
public class LeetCode_1920 {
    public static  int[] buildArray(int[] a) {
          int n=a.length;
          if(n==0){  //No apllicable here
              return null;
          }
          if(n==1){
              return new int[]{a[0]};
          }
          int ans[]=new int[n];
          for(int i=0;i<n;i++){
              ans[i]=a[a[i]];
          }
          return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};  //[0,1,2,4,5,3]
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
