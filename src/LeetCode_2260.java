import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_2260 {

    public static int minimumCardPickup_UsingHashMap(int[] a) {
          int n= a.length;
           if(n<1) return -1;
        HashMap<Integer,Integer> mp= new HashMap<Integer,Integer>();
        int min=Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(mp.containsKey(a[i])) {
                min = Math.min(min, i - mp.get(a[i]) + 1);
            }
               mp.put(a[i],i);
        }
        return min==Integer.MAX_VALUE ?-1:min;
    }

    public static int minimumCardPickup(int[] a){
        int n= a.length;
        if(n<1) return -1;
        int min = Integer.MAX_VALUE;
        int lookup[]=new int[1000000];
        Arrays.fill(lookup,-1);
        for(int i = 0; i < n; i++){
            if(lookup[a[i]]!=-1){
                min = Math.min(min, i - lookup[a[i]] + 1);
            }
            lookup[a[i]] = i;
        }
        return min==Integer.MAX_VALUE?-1 : min;
    }
    public static void main(String[] args) {
        int a[]={3,4,2,3,4,7};
       int res= minimumCardPickup(a);
        System.out.println("Final Result: " + res);
    }
}
