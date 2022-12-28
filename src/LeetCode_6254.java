import java.util.Arrays;

public class LeetCode_6254 {
    public  static  long dividePlayers(int[] a) {
           int n=a.length;
           long myAns=0;
        Arrays.sort(a);
        for(int i=0;i<n/2;i++){

            if(a[i]+a[n-i-1]!=a[0]+a[n-1]){
                return -1;
            }
            myAns += a[i]*a[n-i-1];
        }

        return myAns;
    }

    public static void main(String[] args) {
    int []a={3,2,5,1,3,4};
    long res=dividePlayers(a);
        System.out.println(res);

    }
}
