package GFG;

import java.util.HashMap;

public class Zero_Sum_SubArray {

    public static long findSubarray(long[] a ,int n)
    {
       if(n==1){
           return a[0]==0 ? 1:0;
       }
       int currSum=0;
       long count=0;
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        mp.put(0,1);
       for(int i=0;i<n;i++){
           currSum+=a[i];
           if(mp.containsKey(currSum)){
               count+=mp.get(currSum);
               mp.put(currSum,mp.get(currSum)+1);
           }else{
               mp.put(currSum,1);
           }
       }
     return count;
    }

    public static void main(String[] args) {
        long a[]={0,0,5,5,0,0};
//        long a[]={6,-1,-3,4,-2,2,4,6,-12,-7};
        int n=a.length;
        long res=findSubarray(a,n);
        System.out.println("Final  result  is " + res);
    }
}
