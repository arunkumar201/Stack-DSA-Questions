public class LeetCode_53 {
/*

Given an integer array nums,
 find the subarray which has the largest sum and return its sum.
Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */
    public  static int maxSubArray(int[] a) {
       int n=a.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return a[0];
        }
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            curr_sum+=a[i];
            if(curr_sum> max_sum){
                max_sum=curr_sum;
            }
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        return max_sum;

    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int res=maxSubArray(arr);
        System.out.println("Final  result: " + res);
    }
}
