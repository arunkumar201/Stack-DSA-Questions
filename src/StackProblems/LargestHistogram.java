package StackProblems;

import java.util.Stack;

public class LargestHistogram {
  static  int getMaxArea(int []a, int n) {
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


   static int getMaxAreaStack(int a[],int n) {
     if(n==0) {
         return 0;
     }
     if(n==1) {
         return a[0];
     }
     int []left=new int[n];   //NSL nearest smallest Left
     int []right=new int[n];// NSR -Nearest Smallest right
       Stack<Integer> st =new Stack<>();

       for(int i=0;i<n;i++) {

           if(st.isEmpty()){
               
           }

       }

      return 0;

   }
    public static void main(String[] args) {

        int[] a = {2, 1, 5, 6, 2, 3};
        int n = a.length;  //12
        int res=getMaxArea(a,n);
        System.out.println("Max Area of Histogram: " + res);
    }
}
