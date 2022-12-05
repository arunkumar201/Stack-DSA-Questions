import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class LeetCode_205 {

    public static boolean isIsomorphic(String s1, String s2) {
        int[] m = new int[512];
        for (int i = 0; i < s1.length(); i++) {
            if (m[s1.charAt(i)] != m[s2.charAt(i)+256]) return false;
            m[s1.charAt(i)] = m[s2.charAt(i)+256] = i+1;
        }
        return true;
}
    public static void main(String[] args) {
        String s1="bbbaaaba";
        String s2="aaabbbba";
//        "bbbaaaba"   false
//        "aaabbbba"
        boolean res=isIsomorphic(s1,s2);
        System.out.println("Final result is " + res);
    }
}
