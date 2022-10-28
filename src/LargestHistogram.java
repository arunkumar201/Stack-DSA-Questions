
import java.util.Arrays;
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
    static int[] getNSL(int a[],int n ){
        int []left=new int[n];// NSR -Nearest Smallest left
        Stack<Integer> st =new Stack<>();
        for(int i=0;i<n;i++) {

            if (st.isEmpty()) {
                left[i] = -1;
            } else if (!st.isEmpty() && a[st.peek()] < a[i]) {
                left[i] = st.peek();
            } else if (!st.isEmpty() && a[st.peek()] >= a[i]) {

                while (!st.isEmpty() && a[st.peek()] >= a[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    left[i] = -1;
                } else {
                    left[i] = st.peek();
                }
            }
            st.push(i);
        }
        return left;
    }

    static int[] getNSR(int a[],int n ){
        int []right=new int[n];// NSR -Nearest Smallest left
        Stack<Integer> st =new Stack<>();
        for(int i=n-1;i>=0;i--) {
            if (st.isEmpty()) {
                right[i] =n;
            } else if (!st.isEmpty() && a[st.peek()] < a[i]) {
                right[i] = st.peek();
            } else if (!st.isEmpty() && a[st.peek()] >= a[i]) {

                while (!st.isEmpty() && a[st.peek()] >= a[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    right[i] = n;
                } else {
                    right[i] = st.peek();
                }
            }
            st.push(i);
        }
        return right;
    }
    static int getMaxAreaStack(int a[],int n) {
        if(n==0) {
            return 0;
        }
        if(n==1) {
            return a[0];
        }
        int []left=getNSL(a,n);   //NSL nearest smallest Left
        int []right=getNSR(a,n);;// NSR -Nearest Smallest right
//        System.out.println(Arrays.toString(left));
//        System.out.println(Arrays.toString(right));
         int MaxArea=Integer.MIN_VALUE;  // MaxArea=(right[i]-left[i]-1)*a[i];

         for(int i=0;i<n;i++){
             int curr_Area=(right[i]-left[i]-1)*a[i];
             MaxArea=Math.max(MaxArea,curr_Area);
         }


       return  MaxArea;
        }

    public static void main(String[] args) {

        int[] a =  {6, 1, 5, 4, 5, 2, 6};
        int n = a.length;  //12
        int res=getMaxArea(a,n);
        int res1 = getMaxAreaStack(a,n);
        System.out.println("Max Area of Histogram: " + res);
        System.out.println("Max Area of Histogram Using Stack: " + res1);
    }
}
