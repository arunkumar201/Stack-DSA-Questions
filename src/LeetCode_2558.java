import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class LeetCode_2558 {

    static int __gcd(int a, int b)
    {
        return b == 0 ? a : __gcd(b, a % b);
    }
    static boolean check(int x,int k) {
        int rem = 0;
        for (int i = 1;i<=x;i++)
            rem = ((rem * 10) +i) % k;
        return rem == 0;
    }
    public static  int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
         ArrayList<Integer> li1=new ArrayList<Integer>();
         ArrayList<Integer> li2=new ArrayList<Integer>();
         int n1=uniqueCnt1;
         int n2 =uniqueCnt2;
         int k=1;
        while(li1.size()<n1 || li2.size()<n2){
               if(k<divisor1){
                   if(divisor1%k!=0 && li1.size()<n1)
                       li1.add(k);
                   }
                   else{
                       if(k%divisor1!=0 && li1.size()<n1)
                           li1.add(k);
                   }
           if(k<divisor2) {
               if (divisor2 % k != 0 && li2.size() < n2) {
                   li2.add(k);
               }
           }
               else{
                   if(k%divisor2!= 0 && li2.size()<n2){
                       li2.add(k);
                   }
               }
             k++;
        }
        System.out.println(li1);
        System.out.println(li2);
        int m1= Collections.max(li1);
        int m2= Collections.max(li2);
        return Math.max(m1,m2);
    }
    public static void main(String[] args) {

//       int divisor1 = 2, divisor2 = 4, uniqueCnt1 = 8, uniqueCnt2 = 2 ;
        int divisor1 = 12, divisor2 = 3, uniqueCnt1 = 2, uniqueCnt2 = 10;
        int res=minimizeSet(divisor1,divisor2,uniqueCnt1,uniqueCnt2);
        System.out.println("Final result: " + res);
    }
}
