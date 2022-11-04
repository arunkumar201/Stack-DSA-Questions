import java.util.HashSet;


public class LeetCode_345 {
    /*
  => https://leetcode.com/problems/reverse-vowels-of-a-string/
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u',
and they can appear in both lower and upper cases, more than once.
Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"


     */
    static boolean isVowel(char s) {
       char c=Character.toUpperCase(s);
        return (c=='A' || c== 'I' || c =='O' || c =='U' || c=='E');
    }
    public static String reverseVowels(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        if(n==1){
            return s;
        }
        // HashSet<Character> hs=new HashSet<Character>();
        // hs.add('A');
        // hs.add('E');
        // hs.add('I');
        // hs.add('O');
        // hs.add('U');
        // hs.add('a');
        // hs.add('e');
        // hs.add('i');
        // hs.add('o');
        // hs.add('u');
        int low=0;
        int high=n-1;
        while(low<high) {
            if (isVowel(s.charAt(low)) && isVowel(s.charAt(high))) {
                char temp = ch[low];
                ch[low] = ch[high];
                ch[high] = temp;
                low++;
                high--;
            }
            if (!isVowel(s.charAt(low))) {
                low++;
            }
            if (!isVowel(s.charAt(high))) {
                high--;
            }
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args)
    {
        String str="aeiou";
        String res=reverseVowels(str);
        System.out.println("Final result: " + res);

    }
}
