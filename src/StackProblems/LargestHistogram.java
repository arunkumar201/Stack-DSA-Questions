package StackProblems;

import java.util.Arrays;
import java.util.Stack;

public class LargestHistogram {
    static int[] getNSL(int a[],int n){
        Stack<Integer>st=new Stack<>();
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
               res[i]=-1;
            }
            else if(!st.isEmpty() && a[st.peek()]<a[i]){
               res[i]=(st.peek());
            }
            else if(!st.isEmpty() && a[st.peek()]>=a[i]) {
                while (!st.isEmpty() && a[st.peek()] >= a[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                   res[i]=-1;
                } else {
                    res[i]=(st.peek());
                }
            }
            st.push(i);
            }

        return res;
        }
    static int[] getNSR(int a[],int n){

        Stack<Integer>st=new Stack<>();
        int res[]=new int[n];
        for(int i=n-1;i>=0;i--) {
            if (st.isEmpty()) {
                res[i] = n;
            } else if (!st.isEmpty() && a[st.peek()] < a[i]) {
                res[i] = (st.peek());
            } else if (!st.isEmpty() && a[st.peek()] >= a[i]) {
                while (!st.isEmpty() && a[st.peek()] >= a[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    res[i] = n;
                } else {
                    res[i] = (st.peek());
                }
            }
            st.push(i);
        }
        return res;
    }
  static  int getMaxArea_BruteForce(int []a, int n) {  //O(N^2)
      if(n==0) {
          return 0;
      }
      if(n==1){
          return a[0];
      }
      int MaxArea=Integer.MIN_VALUE;
      int myArea=0;
      int count = 0;
      for(int i=0; i<n; i++) {
           count=1;
          for(int j=i+1;j<n;j++) {
              if (a[j]<a[i]) {
                  break;
              } else {
                  count++;
              }
          }
              for(int k=i-1;k>=0;k--) {
                  if (a[k]< a[i]) {
                      break;
                  } else {
                      count++;
                  }
              }
              myArea=count*a[i];
              if(myArea>=MaxArea) {
                  MaxArea = myArea;
              }

          }
          return MaxArea;
      }

   static int getMaxAreaStack(int a[],int n) //efficient Approach TC=O(N)
   {
       if(n==0) {
       return 0;
       }
       if(n==1) {
           return a[0];
       }
       int []left=getNSL(a,n);   //NSL nearest smallest Left
       int []right=getNSR(a,n);// NSR -Nearest Smallest right
       // System.out.print(Arrays.toString(left));
       int max=Integer.MIN_VALUE;
       int Area=0;
       for(int i=0;i<n;i++){
           Area=(right[i]-left[i]-1)*a[i];
           max=Math.max(Area,max);
       }
       return max;
   }
    public static void main(String[] args) {

        int[] a = {2, 1, 5, 6, 2, 3};
        int n = a.length;  //10
        int res=getMaxAreaStack(a,n);
        System.out.println("Max Area of Histogram: " + res);
    }

}
