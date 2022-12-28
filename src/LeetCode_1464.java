public class LeetCode_1464 {

    public static int maxProduct(int[] nums) {
        int First_max=Integer.MIN_VALUE;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(First_max<nums[i]){
                First_max=nums[i];
                k=i;
            }
        }
        int Second_max=Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(Second_max<nums[i] && k!=i ){
                Second_max=nums[i];
            }
        }
       return (First_max-1)*(Second_max-1);
    }

    public static void main(String[] args) {
        int []nums ={3,4,5,2};
        int res=maxProduct(nums);
        System.out.println("Final result is " + res );
    }
}
