import java.util.*;

public class LeetCode_698 {
    public  static List<String> topKFrequent(String[] w, int k) {
        int n = w.length;
        if (n == 0) return null;
        if (n == 1) return k == 1 ? new ArrayList<String>(Arrays.asList(w)) : null;

        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            mp.put(w[i], mp.getOrDefault(w[i], 0) + 1);
            max = Math.max(max, mp.get(w[i]));
            min = Math.min(min, mp.get(w[i]));
        }
        System.out.println(mp);
//        String str="";
        List<String> res = new ArrayList<String>();
        if (max == 1 && min == 1) return new ArrayList<String>(Arrays.asList(w));
        HashSet<String> hs = new HashSet<String>();
        String temp[] = new String[k];
        int l = 0;
        for (int j = max; j >= min && k != 0; j--) {
            for (Map.Entry<String, Integer> e : mp.entrySet()) {
                int x = e.getValue();
                if (x == j) {
//                    System.out.println(x);
                    if (!hs.contains(e.getKey())) {
                        temp[l++] = (e.getKey());
                        k--;
                    }
                    hs.add(e.getKey());
                }
            }
        }
        System.out.println(Arrays.toString(temp));


        int i=0;
        for( i=0;i<temp.length-1;i++){
//            System.out.println(mp.get(temp[i]));
            if(mp.get(temp[i])==mp.get(temp[i+1])){
              res.add(temp[i]);
               res.add(temp[i+1]);
//                System.out.println(temp[i]);
                Collections.sort(res.subList(i,i+2));
         }else
            res.add(temp[i]);
        }
        if(i<temp.length) res.add(temp[i]);
        System.out.println(res.toString());
        return res;
    }

    public static void main(String[] args) {
//        String s[]={"i","love","leetcode","i","love","coding"};
        String s[]={"the","day","is","sunny","the","the","the","sunny","is","is"};
//        Arrays.sort(s);
//        System.out.println(Arrays.toString(s));
        int k=4;
        List<String> res=topKFrequent(s,k);
        System.out.println("Final result is:" + res);
    }
}
