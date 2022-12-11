import java.util.HashMap;

public class LeetCode_1512 {
/*
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */
    public static int numIdenticalPairs(int[] a) {
        int n=a.length;
        if(n==1) return 0;
        if(n==2){
            return a[0]==a[1]?1 : 0;
        }
        int count=0;

        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i: a){
            int j=mp.getOrDefault(i,0);
            count+=j;
            mp.put(i,j+1);
        }
   return count;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,1,1,3};
        int res=numIdenticalPairs(a);
        System.out.println("Final  result:  " + res);
    }
}
