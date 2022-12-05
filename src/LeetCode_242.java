import java.util.Arrays;

public class LeetCode_242 {
    public static  boolean isAnagram(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n1!=n2) return false;
        if(n1==1 && n2==1) {
            Character ch1=s1.charAt(0);
            Character ch2=s2.charAt(0);
            if(ch1.equals(ch2)) return true;
            else return false;
        }
        int lookup1[]=new int[26];
        int lookup2[]=new int[26];
        for(int i=0;i<n1;i++) {
            lookup1[s1.charAt(i) - 'a']++;
            lookup2[s2.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(lookup1));
        System.out.println(Arrays.toString(lookup2));
        for(int i=0;i<26;i++) {
            int c=lookup1[i];
            int d=lookup2[i];
            if(c!=d) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="nl";
        String s2="cx";
        boolean res=isAnagram(s1, s2);
        System.out.println("final result  is " + res);

    }
}
