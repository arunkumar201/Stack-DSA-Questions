import java.util.Arrays;

public class LeetCode_1323 {
    public static int maximum69Number (int a) {
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
