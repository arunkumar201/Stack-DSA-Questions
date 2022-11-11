import java.util.Arrays;

/*
Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element appears only once.
 The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages,
you must instead have the result be placed in the first part of the array nums.
 More formally, if there are k elements after removing the duplicates,
 then the first k elements of nums should hold the final result.
 It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array.
 You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class LeetCode_26 {

    public static int removeDuplicates(int[] a) {
                int n=a.length;
                if(n==0){
                    return 0;
                }
                if(n==1){
                    return 1;
                }

                int i=0;
                int j=0;
                while(j<n){
                    if(a[i]!=a[j]){
                        a[++i]=a[j];
                        j++;
                    }
                    else{
                        j++;
                    }
                }
                return i+1;
    }
    public static void main(String[] args) {
        int a[]={1,11,2,22,22,222,11,11,111,0,0,0,8,6,5,8};
        int res=removeDuplicates(a);
        System.out.println("Final  result:"+ res);

    }

}
