import java.util.Arrays;

public class LeetCode_2498 {

public static  int maxJump(int[] a) {
  int res = a[1] - a[0], n = a.length;
  for (int i = 2; i < n; i++) {
      res = Math.max(res, a[i] - a[i - 2]);
  }
  return res;
    }
    public static void main(String[] args) {
        int a[]={0,2,5,6,7};  //ans=5
        int res=maxJump(a);
        System.out.println("Final result is " + res);
    }
}
