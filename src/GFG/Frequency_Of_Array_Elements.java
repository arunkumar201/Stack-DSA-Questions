package GFG;

import java.util.Arrays;
import java.util.HashMap;

//https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1
public class Frequency_Of_Array_Elements {


    public static void frequencyCount(int a[], int n, int p)
    {
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int item:a){
            mp.put(item,mp.getOrDefault(item,0)+1);
        }
        for(int i=0;i<n;i++){
             if(mp.containsKey(i+1)){
                 a[i]=mp.get(i+1);
             }
             else{
                 a[i]=0;
             }
        }
    }

    public static void main(String[] args) {

        int arr[] ={3,3,3,3};
        int P = 3;
        frequencyCount(arr,arr.length,P);
        System.out.println("Final result is " + Arrays.toString(arr));
    }
}
