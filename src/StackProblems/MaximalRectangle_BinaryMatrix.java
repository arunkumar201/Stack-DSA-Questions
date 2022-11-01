package StackProblems;

import java.util.Stack;

public class MaximalRectangle_BinaryMatrix {
    static int[] getNSL(int a[],int n){
        Stack<Integer> st=new Stack<>();
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
    public static int MAH(int a[],int n){
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
//Main Function That returns the  largest rectangle filled with all 1s
    public static int maxRectangle(int [][]arr,int r,int c) {
        //r=rows and c=columns
       // base Case-1 when binary matrix is empty
        if(r==0 && c==0) {
            return 0;
        }
        // base Case-2 when binary matrix is 1*1
        if(r==1 && c==1) {
            return  arr[0][0]==0 ? 0 : 1;
        }

        //helper array which holds the rows values and we passes to get max_res for each rows
        int helper[]=new int[arr[0].length];
        for(int i=0;i<c;i++) {
            helper[i]=arr[0][i];
        }
        //Determine the largest area of the Binary matrix all filled with 1's
        //similar to Maximum Area in rectangle
        //Passing first row array reference to MAH function with their size e
        int max_res=MAH(helper,c);
        //finding the max_res from 2nd row for each row in the Binary matrix
        for(int i=1;i<r;i++) {
            for(int j=0;j<c;j++) {
                //if arr[i][j]==0 then make  immediately helper[j]=0
                if (arr[i][j] == 0) {
                    helper[j] = 0;
                } else {
                    helper[j] = helper[j] + arr[i][j];
                }
            }
            max_res = Math.max(max_res,MAH(helper,c));
            }
      return max_res;
    }
    public static void main(String[] args) {
        int rows= 4;  //Number of rows in the matrix
        int columns= 4;//Number of columns in the matrix
        //the given binary matrix filled with all 1's and all 0's;
        int height[][] = {
                { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 0 },
        };  //result should be 8
        System.out.print("Area of maximum rectangle is "+ maxRectangle(height, rows, columns));
    }
    }

