public class LeetCode_6241 {
    public static int unequalTriplets(int[] a) {
   int count=0;
   int  n=a.length;
   for(int i=0;i<n-2;i++) {
       int y=a[i];
       for (int j = i+1; j < n-1; j++) {
           // nums[i] != nums[j], nums[i] != nums[k]
//           nums[j] != nums[k].
           int x=a[j];
               for (int k = j+1;k <n; k++) {
                   if (a[i]!= a[j] && a[i]!=a[k] && a[j]!=a[k]) {
                       count++;
                   }

           }
       }
   }
   return count;
    }

    public static void main(String[] args) {
  int a[]={2,1,1};
  int res=unequalTriplets(a);
        System.out.println("Final  result: "+res);

    }
}
