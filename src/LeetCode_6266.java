import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class LeetCode_6266 {

    public static ArrayList<Integer> primeFactors(int n)
    {
        ArrayList<Integer> li=new ArrayList<>();
        while (n % 2 == 0)
        {
            li.add(2);
            n = n/2;
        }
        for (int i = 3; i <= Math.sqrt(n); i = i + 2)
        {
            while (n % i == 0)
            {
               li.add(i);
                n = n/i;
            }
        }
        if (n > 2)
            li.add(n);

        return li;
    }

    public static  int smallestValue(int n) {
        int min =Integer.MAX_VALUE;
        int res = 0;
        int x=n;
        ArrayList<Integer> li=new ArrayList<>();
        while (li.size()> 1 || x==n) {
             li = primeFactors(x);
             if(li.size()==1){
                 return li.get(0);
             }
             for (int i = 0; i < li.size(); i++) {
//                System.out.println(res);
                res += li.get(i);
            }
           if(res==x) return 4;
            min =Math.min(min,res);
            x=res;
            res=0;
        }

      return min;



    }
    public static void main(String[] args) {
int n=15;
int res=smallestValue(n);
        System.out.println("Final result is " + res);
    }
}
