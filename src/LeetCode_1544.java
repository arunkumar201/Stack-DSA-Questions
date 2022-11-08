import javax.crypto.spec.ChaCha20ParameterSpec;
import java.util.Arrays;
import java.util.Stack;

public class LeetCode_1544 {
/*
Given a string s of lower and upper case English letters.

A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:

0 <= i <= s.length - 2
s[i] is a lower-case letter and s[i + 1] is the same letter
but in upper-case or vice-versa.
To make the string good, you can choose two adjacent characters
 that make the string bad and remove them.
 You can keep doing this until the string becomes good.
Return the string after making it good.
 The answer is guaranteed to be unique under the given constraints.
Notice that an empty string is also good.
Example 1:
Input: s = "leEeetcode"
Output: "leetcode"
Explanation: In the first step,
either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode"
 */


    public static String makeGood_usingStack(String s) {
       int n=s.length();
        if(n==0) return null; //no needed here
        if(n==1) return s;
       char ch[]=s.toCharArray();
       Stack<Character> st=new Stack<>();

         for(int i=0;i<n;i++){

              if( !st.isEmpty() &&  Math.abs(Math.abs(st.peek())-Math.abs(ch[i]))==32){
                  st.pop();
              }
              else
              st.push(ch[i]);
         }
         String res="";
         while(!st.isEmpty()){ res=st.pop()+res; }
         return res;
    }

    public static String makeGood(String s){
        int n=s.length();
        if(n==0) return null; //no needed here
        if(n==1) return s;

        int j=0;
        char ch[]=s.toCharArray();
        for(int i = 1; i<n; i++) {
            if(j < 0) {
                ch[++j]=ch[i];
            }
            else if((ch[j]^32)!= ch[i]){
                ch[++j]=ch[i];
            }
            else{
                j--;
            }
        }
        String res=String.valueOf(ch);
        return res.substring(0,j+1);
    }
    public static void main(String[] args) {
      String  s = "leEeetcode";
        String res=makeGood(s);
        System.out.println("Final result: " + res);
        char ch1='a';
        int Capital_ch1=((ch1)^32);
        System.out.println((char)Capital_ch1);
//        similarly
        char ch2='A';
        int Capital_ch2=((ch2)^32);
        System.out.println((char)Capital_ch2);


    }
}
