import java.util.HashSet;

public class LeetCode_2461 {
/*
You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:

The length of the subarray is k, and
All the elements of the subarray are distinct.
Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.

A subarray is a contiguous non-empty sequence of elements within an array.



Example 1:

Input: nums = [1,5,4,2,9,9,9], k = 3
Output: 15
 */
public static long maximumSubarraySum(int[] a, int k) {
  int n=a.length;
    if(n==1 && k==1){
        return a[0];
    }
    HashSet<Integer> hs=new HashSet<Integer>();
    long max=Integer.MIN_VALUE;
    int len=0;
    long sum=0;
    long ans=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
         sum+=a[i];
        if(sum>max && !hs.contains(a[i])){
            sum=max;
            len++;
            if(len==k){
               ans=Math.max(ans,max);
            }
        }
       else if(sum>0 && hs.contains(a[i])){
            sum=0;
            len=0;
        }
        else if(sum<0 && !hs.contains(a[i])){
            sum=0;
            len=0;
        }
        hs.add(a[i]);
    }

    return ans;
}
    public static void main(String[] args) {
    int a[]={1,5,4,2,9,9,9};
    int k=3;
    long res=maximumSubarraySum(a,k);
    System.out.println("Final result is:" + res);
    }
}
