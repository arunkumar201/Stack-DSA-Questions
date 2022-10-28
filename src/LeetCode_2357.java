import java.util.Arrays;
import java.util.HashSet;

public class LeetCode_2357 {
  static int minimumOperations(int[] a){
      int n=a.length;
      if(n==1 && a[0]!=0) {
          //if in an array has only one item and item is not zero
          return 1;
      }
      if(n==1 && a[0]==0) {
          //if in an array has only one item
          return 0;
      }
      Arrays.sort(a);
      int count=0;
      int c_0 = 0;
      for(int i=0;i<n-1;i++){
          if(a[i]!=a[i+1] && (a[i+1]!=0 && a[i]!=0)){
              count++;
          }
          if(a[i]==0) //when [0,0,0,0,0,0,0]
          {
              c_0++;
          }

      }
      if(c_0+1==n){  //loop is running n-1 times
          return 0;
      }
      return count+1;

  }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
       int res= minimumOperations(arr);
       int res_Efficient=minimumOperations_UsingSet(arr);
        System.out.println("Minimum Number of Operations: " + res);
        System.out.println("MinimumOperationsUsingSet "+ res_Efficient);
    }

   static int minimumOperations_UsingSet(int[] a){
      HashSet<Integer> hs=new HashSet<>();

      for(int item:a){
          if(item>0){
              hs.add(item);
          }
      }
      return hs.size();
   }
}
