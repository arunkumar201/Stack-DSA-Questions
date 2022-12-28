import java.util.Stack;

public class LeetCode_152 {
    public static int maxProduct(int[] a) {
        int n=a.length;
        if(n==0){
            return 0;
        }
        if (n == 1) {
            return a[0];
        }
        int l=1;
        int r=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
          //in case if left sum become 0  or right sum becomes zero 0 then we need to
            //update the right sum and left sum to 1
            l=l==0?1:l;
            r=r==0?1:r;
            //left prefix sum
            l*=a[i];
            //right prefix sum
            r*=a[n-1-i];
            max=Math.max(max,Math.max(l,r));
        }
   return max;
    }
    public static void main(String[] args) {
        int a[]={2,0,0,-2,-4};
        int res=maxProduct(a);
        System.out.println("Final  result:"+res);
    }
}
