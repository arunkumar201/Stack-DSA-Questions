import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode_451 {


    public static String frequencySort(String s) {
        int n = s.length();
        if (n == 0) return null;
        if (n == 1) return s;
        char[] ch = s.toCharArray();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        for (char c : ch) {
            mp.put(c,mp.getOrDefault(c,0)+1);
            max = Math.max(max, mp.get(c));
            min = Math.min(min, mp.get(c));
        }
        if (max == 1 && min == 1) return s;
        String ans = "";
        for (int i = max; i >= min; i--) {
            for (Map.Entry<Character, Integer> e : mp.entrySet()) {
                int x = e.getValue();
                if (x == i) {
                    while (x!=0){
                        ans = ans + e.getKey();
                        x--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s="tree";
        String res=frequencySort(s);
        System.out.println("Final result is " + res);
    }
}
