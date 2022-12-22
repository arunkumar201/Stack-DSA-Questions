import java.util.*;

public class LeetCode_1636 {

    public static int[] frequencySort(int[] a) {
        int n=a.length;
        if(n==1){
            return a;
        }
        int res[]=new int[n];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i:a){
            mp.put(i,mp.getOrDefault(i,0)+1);
            max = Math.max(max, mp.get(i));
            min = Math.min(min, mp.get(i));
        }
//        HashSet<Integer> hs=new HashSet<Integer>();
        if (max == 1 && min == 1) return a;
        System.out.println(mp);
        int j=0;
        for (int i = min; i <= max; i++) {
            for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
                int x = e.getValue();
                if (x==i) {
                    while (x != 0) {
                        res[j++] = e.getKey();
                        x--;
                     }
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
       int a[]={2,3,1,3,2};
       int res[]=frequencySort(a);
        System.out.println("Final Result: " + Arrays.toString(res));
    }
}
