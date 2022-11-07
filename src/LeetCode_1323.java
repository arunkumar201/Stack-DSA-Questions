import java.util.Arrays;

public class LeetCode_1323 {

    public static int  maximum69Number(int n){
        int temp=n;
        int c=0;
        int count=-1;  //intial count of positionws
        while(temp>0){
            int d=temp%10;  //taking last digit
            if(d==6){  //if it is 6 then we were try to do same until we get temp=0;
                count=c;
            }
            c++;
            temp=temp/10;
        }
        //count==-1 that means there is no 6 in the number eg 99999 ,we will return n as it is
        // otherwise we will take the  last position of the 6 from the end
        //just add n=n+3*10^count ,where count=number of digits from its right hand side (including)
        return count==-1?n:(n+3*(int)Math.pow(10,count));
    }
    public static int maximum69Number_Best_Solution (int a) {
          String str=String.valueOf(a);
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='9'){
              ch[i]='9';
             String res=String.valueOf(ch);
              return  Integer.parseInt(res);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int n=9669;
        int res=maximum69Number(n);
        System.out.println("Final result is " + res);
    }
}
