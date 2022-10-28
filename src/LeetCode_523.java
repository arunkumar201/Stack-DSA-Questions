public class LeetCode_523 {
    //https://leetcode.com/problems/continuous-subarray-sum/
    static boolean checkSubarraySum_BruteForce(int a[],int k){
        if (a.length < 2) {
            return false;
        }
        int n=a.length;
        int currSum = 0;
        int c=0;
        for(int i=0;i<n;i++){
            currSum = 0;
            c=0;
            for(int j = i; j <n;j++){
                currSum+=a[j];
                c++;
                if(c>=2 && currSum%k==0){
                    return true;
                }
            }
        }
        return false;
    }


    
    public static void main(String[] args) {
        int arr[]={23,2,4,6,7};
//        int arr[]={1,0};
        int k=2;
        boolean res=checkSubarraySum_BruteForce(arr,k);
        System.out.println("Final Result:"+res);
    }

}
