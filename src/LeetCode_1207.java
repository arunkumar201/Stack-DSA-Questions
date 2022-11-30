import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LeetCode_1207 {

    public static boolean uniqueOccurrences(int[] a) {
        int n=a.length;
         if(n==0) return false;
         if(n==1) return true;
         HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

         for(int i:a) {
             if (map.containsKey(i)) {
                 map.put(i, map.get(i) + 1);
             } else {
                 map.put(i, 1);
             }
         }
//         System.out.println(map);
       HashSet<Integer> hs = new HashSet<Integer>();
         for(int i:map.values()){
             if(hs.contains(i)){
                 return false;
             } else{
                hs.add(i);
             }
         }
         return true;
    }
    public static void main(String[] args) {
        int a[]={1,2,2,1,1,3};
        boolean res=uniqueOccurrences(a);
        System.out.println("Final result is " + res);
    }
}
