import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_6248 {
    public static int findMedian(int a[])
    {
        int n=a.length;
        Arrays.sort(a);
        if (n % 2 != 0){
            double d=a[n / 2]-1;
            return  (int)(d);
        }
        double d2=(((a[(n - 1) / 2] + a[n / 2]) / 2.0));
        return (int) (d2);
    }
    public static int countSubarrays(int[] a, int k) {
     int n=a.length;
       if(n==0)  {
           return 0;
       }
       if(n==1){
           return k==a[0]?1:0;
       }
//       int temp[]=new int[n];
        int count=0;
       int x=0;
        ArrayList<Integer> li=new ArrayList<>();
       for (int i =1; i< n;i++) {
           x=0;
           for (int j = i; j < n; j++) {
               int temp[]=new int[n-i];
               temp[x++]=a[j];
               if (k==findMedian(temp)) {
                   count++;
               }
           }
       }
       return count;

    }
    public static void main(String[] args) {
//        int a[]={2,5,1,4,3,6}; //3

       int a[]={3,2,1,4,5}; //4
         int  k=1;

//        int k=1;
        int res=countSubarrays(a,k);
        System.out.println("Final count: " + res);
    }
}
