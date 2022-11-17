import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_1365 {

    public static int[] smallerNumbersThanCurrent_BruteForce(int[] a){
        int n = a.length;
        int res[]=new int[n];

        for (int i = 0; i < n; i++) {
          int count=0;
            for(int j = 0; j <n;j++){
                if(a[j]<a[i]){
                    count++;
                }
            }
            res[i]=count;
        }
return res;
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer> m= new HashMap<>();
        int[] nums1= nums.clone();
        Arrays.sort(nums);
        int[] result= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(!m.containsKey(nums[i])){
                m.put(nums[i],m.getOrDefault(nums[i],i));
            }
        }
        for(int j=0;j<nums.length;j++){
            result[j]=m.get(nums1[j]);
        }

        return result;
    }
    public static void main(String[] args) {
        int a[]={8,1,2,2,3};
        int res[]=smallerNumbersThanCurrent(a);

        System.out.println("Final result is " + Arrays.toString(res));
    }
}
