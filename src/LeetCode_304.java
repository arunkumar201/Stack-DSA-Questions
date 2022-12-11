import java.util.Arrays;

public class LeetCode_304 {
    public  static  boolean increasingTriplet(int[] a) {
        int n = a.length;
        if(n<3) return false;
        if(n==3){
            if(a[0]< a[1] && a[1]<a[2]) return true;
            return false;
        }
        int []nextMax=new int[n];
        int max1=Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--){
            if(a[i]>max1){
                max1=a[i];
                nextMax[i]=max1;
            }else{
                nextMax[i]=max1;
            }
        }
        System.out.println(Arrays.toString(nextMax));
        int i=0;
        int j=2;
        while(j<n){
             if(a[i]<a[i+1] && a[i+1]<nextMax[j]){
                 return true;
             }
             if(j+1==n-1){
                 i++;
                 j++;
             }else{
                 i+=2;
                 j+=2;
             }
        }

      return false;
    }

    public static void main(String[] args) {
        int a[]={20,100,10,12,5,3};
        boolean res=increasingTriplet(a);
        System.out.println("Final result is " + res);
    }
}
