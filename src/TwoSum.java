import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){

            if(hs.containsKey(target-nums[i])){
                ans[0]=i;
                ans[1]=hs.get(target-nums[i]);
                 return ans;
            }
            hs.put(nums[i],i);
        }

        return ans;

    }

    public static void main(String[] args) {
        int a[]={1,3,4,5};
        int target=7;
        int []ans=new int[2];
        ans=twoSum(a, target);
        System.out.println("Final result: " + ans[0]+","+ ans[1]);
    }
}
