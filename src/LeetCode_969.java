import java.util.ArrayList;
import java.util.List;

public class LeetCode_969 {

    public static List<Integer> pancakeSort(int[] a) {
        List<Integer> res = new ArrayList<>();
        int end=a.length;
         while(end!=0 && end!=1){
             //Max Value Index in an array from o to end
             int index=findMaxValueIndex(a,end);
             flip(a,index);
             flip(a,end-1);
             res.add(index+1);
             res.add(end);
             end--;
         }
    return res;
    }
    private  static  int findMaxValueIndex(int a[],int target){
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }
  private  static void flip(int a[],int index){
        int start=0;
        while(start<index){
            int temp=a[start];
            a[start]=a[index];
            a[index]=temp;
            start++;
            index--;
        }
  }
    public static void main(String[] args) {
        int a[]={3,2,4,1};
        List<Integer> li=pancakeSort(a);
        System.out.println("Final  result: " + li);
    }
}
