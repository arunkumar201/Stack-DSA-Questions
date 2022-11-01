package StackProblems;

import java.util.Stack;

//Leetcode 32
public class Longest_Valid_Parentheses {
   static int longestValidParentheses(String s) {
       int n = s.length();
       if (n == 0) {
           return 0;
       }
       int max = Integer.MIN_VALUE;
       Stack<Character> st = new Stack<>();
       Stack<Integer> Index = new Stack<Integer>();
       Index.push(-1);
       for (int i = 0; i < n; i++) {
           if (s.charAt(i) =='(') {
               st.push('(');
               Index.push(i);
           } else {
               if (!st.isEmpty() && st.peek()=='(') {
                   st.pop();
                   Index.pop();
                   max = Math.max(max,i-Index.peek());
               } else {
                   Index.push(i);
               }
           }
       }
       return max;
   }


    public static void main(String[] args) {
        String s="(()())";
        int n=longestValidParentheses(s);
        System.out.println("Maximum length of longest valid parentheses is " +n);


    }

}
