import java.util.Arrays;

public class LeetCode_1470 {
    //1470. Shuffle the Array
    public static int[] shuffle(int[] a, int k) {
        int i=0;
        int j=k;
        int x=0;
        int n=a.length;
        int res[]=new int[n];
        while(i<n){
            res[i]=a[x++];
            res[i+1]=a[j++];
            System.out.println(Arrays.toString(res));
            i+=2;
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,4,3,2,1},k = 4;
        int res[]=shuffle(nums,k);
        //out=[1,4,2,3,3,2,4,1]
        System.out.println("Final result is " + Arrays.toString(res));
    }








}
