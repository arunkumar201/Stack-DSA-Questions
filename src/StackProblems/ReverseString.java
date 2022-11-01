package StackProblems;

import java.util.Stack;

public class ReverseString {
    static String reverse(String s) {

        if (s==null || s.length() == 0) {
            System.out.println("String is Null or empty");
            return "";
        }
        int n=s.length();
        Stack<Character> st=new Stack<Character>();
        String newstr="";
        for (int i=0;i<n;i++) {
            st.push(s.charAt(i));
        }
        while (!st.isEmpty()) {
                char ch = st.pop();
                newstr = newstr+ch;
            }
        return newstr;

    }
    public static void main(String[] args) {
        String s=null;
       String str=reverse(s);
        System.out.println("Original String was:"+s);
        System.out.println("\nNew reverse String is:"+str);
    }
}
