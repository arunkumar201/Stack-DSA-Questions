public class LeetCode_153 {
   /*
   Given an integer array nums, find a subarray that has the largest product,
   and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
    */

    public static int maxProduct_BruteForce(int[] a) {
        int n = a.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return a[0];

        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int curr_ProductSum=1;
            for (int j =i; j <n;j++) {
                curr_ProductSum*=a[j];
                if(curr_ProductSum>max){
                    max=curr_ProductSum;
                }
            }
        }
        return max;

    }


    public static void main(String[] args) {
  int a[]={2,3,-2,4};
  int res=maxProduct_BruteForce(a);
  System.out.println("Final  result:"+ res);
    }
}
