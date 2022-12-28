import java.util.Arrays;

public class LeetCode_2279 {
    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
int n=rocks.length;
         int rem=additionalRocks;
       for(int i=0;i<n;i++){
           rocks[i]=capacity[i]-rocks[i];
       }
       Arrays.sort(rocks);
        int count=0;
       for(int i=0;i<n;i++){
           if(rocks[i]!=0 && rem>0){
               int temp=rocks[i];
               if(rem>=rocks[i]) {
                   rocks[i] -= rocks[i];
                   rem = rem - temp;
                   count++;
               }
           }
           else  if(rem>0) count++;
       }
 return count;
    }

    public static void main(String[] args) {
       int[]capacity = {91,54,63,99,24,45,78};
       int[]rocks = {35,32,45,98,6,1,25};
       int additionalRocks =17;
       int res=maximumBags(capacity, rocks, additionalRocks);
        System.out.println("Final result: " + res);
    }
}
