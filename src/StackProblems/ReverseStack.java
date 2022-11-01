package StackProblems;

import java.util.ArrayList;
import java.util.Stack;

/*
Given: A stack of integers.

Task: Reverse the stack using recursion.

Constraints: We are not allowed to use any loop constructs like for, while, or do-while.
Input: st = [1, 5, 3, 2, 4]
Output:[4, 2, 3, 5, 1]
Explanation: After reversing the stack [1, 5, 3, 2, 4] becomes [4, 2, 3, 5, 1].
 */
public class ReverseStack {
    static void Insert_At_Bottom(Stack<Integer> st,int temp){
        if(st.isEmpty()){
            st.push(temp);
            return;
        }
        else{
            int temp2 = st.peek();
            st.pop();
            Insert_At_Bottom(st,temp);
            st.push(temp2);
        }
    }
  static void reverse(Stack<Integer> st){
      if(st.isEmpty()){
          return;
      }
       int temp = st.peek();
        st.pop();
      reverse(st);
      Insert_At_Bottom(st, temp);
  }
 static void reverseUsingExtraSpace(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
      ArrayList<Integer> li = new ArrayList<Integer>();
        while(!st.isEmpty()){
          li.add(st.peek());
          st.pop();

      }
      System.out.println(st);
     for(int x:li){
//         System.out.println(x);
         st.push(x);
     }
     System.out.println(st);

 }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();
        st.push(1);
        st.push(5);
        st.push(3);
        st.push(2);
        st.push(4);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
        reverseUsingExtraSpace(st);

    }
}
