import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_1657 {
    public static boolean closeStrings_InEffection(String w1, String w2) {
        if (w1 == null || w2 == null) {
            return false;
        }
            int n1 = w1.length();
            int n2 = w2.length();
            if (n1 != n2) return false;

            HashMap<Character, Integer> mp1 = new HashMap<>();
            HashMap<Character, Integer> mp2 = new HashMap<>();
            int i = 0;
            for (i = 0; i < n1; i++) {
                if (mp1.containsKey(w1.charAt(i))) {
                    mp1.put(w1.charAt(i), mp1.get(w1.charAt(i)) + 1);
                } else {
                    mp1.put(w1.charAt(i), 1);
                }
            }
            i=0;
            for (i = 0; i < n2; i++) {
                if (mp2.containsKey(w2.charAt(i))) {
                    mp2.put(w2.charAt(i), mp2.get(w2.charAt(i)) + 1);
                } else {
                    mp2.put(w2.charAt(i), 1);
                }
            }
            int s1[]=new int[n1];
            int s2[]=new int[n2];
            int m=0,n=0;
         for(int j:mp1.values()) {
             s1[m++]=j;
         }
         for(int k:mp2.values()) s2[n++]=k;
//        System.out.println(Arrays.toString(s2));
//        System.out.println(Arrays.toString(s1));
        Arrays.sort(s1);
        Arrays.sort(s2);
        for( i=0;i<n1;i++) {
            if(s1[i]!=s2[i]) {
                return false;
            }
        }

        for(int y=0;y<n2;y++) {
            if((mp1.containsKey(w1.charAt(y)) != mp2.containsKey(w1.charAt(y)))){
                return false;
            }
        }
        return true;
    }

    public static boolean closeStrings(String w1, String w2) {
        if (w1 == null || w2 == null) {
            return false;
        }
        int n1 = w1.length();
        int n2 = w2.length();
        if (n1 != n2) return false;
        int ch1[]=new int[26];
        int ch2[]=new int[26];
        for(char c:w1.toCharArray()){
            ch1[c-'a']++;
        }
        for(char c:w2.toCharArray()){
            ch2[c-'a']++;
        }
        //check the both string having same characters or not
        for(int i=0;i<n1;i++) {
            if((ch1[i]==0 &&ch2[i]!=0) || (ch1[i]==0 &&ch2[i]!=0)) {
                return false;
            }
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<n1;i++) {
            if(ch1[i]!=ch2[i]) {
                return false;
            }
        }
    return true;
    }
    public static void main(String[] args) {
        String s1="abca";
        String s2 = "bcaa";
        boolean res=closeStrings(s1, s2);
        System.out.println("Final result: " + res);
    }
}
