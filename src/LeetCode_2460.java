import java.util.Arrays;

/*
You are given a 0-indexed array nums of size n consisting of non-negative integers.

You need to apply n - 1 operations to this array where, in the ith operation (0-indexed), you will apply the following on the ith element of nums:

If nums[i] == nums[i + 1], then multiply nums[i] by 2 and set nums[i + 1] to 0. Otherwise, you skip this operation.
After performing all the operations, shift all the 0's to the end of the array.

For example, the array [1,0,2,0,0,1] after shifting all its 0's to the end, is [1,2,1,0,0,0].
Return the resulting array.

Note that the operations are applied sequentially, not all at once.
 */
public class LeetCode_2460 {
    public static int[] applyOperations(int[] a) {

        int n = a.length;
        for (int i = 0; i < n - 1; i++) {

            if (a[i] == a[i + 1]) {
                a[i] = 2 * a[i];
                a[i + 1] = 0;
            }
        }

        int high=0;
        int low=0;
        while(high<n && low<n){
            if(a[high]!=0 && a[low]!=0){
                high++;
                low++;
            }
            else if(a[low]==0 && a[high]==0){
                high++;
            }
            else{
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;
                low++;
                high++;

            }


        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={1,2,2,1,1,0};
        int res[]=applyOperations(a);
        System.out.println("Final result"+ Arrays.toString(res));
    }
}
