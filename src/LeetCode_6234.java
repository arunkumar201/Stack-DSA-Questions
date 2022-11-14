import java.util.Arrays;

public class LeetCode_6234 {
   public static int getLCM(int First_number,int Second_number){
   int x,max=0,min=0,lcm=0;
        if(First_number>Second_number)
    {
        max=First_number;
        min=Second_number;
    }
        else
    {
        max=Second_number;
        min=First_number;
    }
    for(int i=1;i<=min;i++)
    {
        x=max*i;
        if(x%min==0)
        {
            lcm=x;
            break;
        }
    }
         return lcm;
}
    public static  int subarrayLCM(int[] a, int k) {
      int n=a.length;
           int count=0;
          int lcm=0;
          for(int i=0;i<n;i++){
              int t=a[i];
              for(int j=i;j<n;j++){
                   t=getLCM(a[j],t);
                   if(lcm==k) {
                       count++;
                   }
              }
      }

    return count;
}

    public static void main(String[] args) {
        int a[]={3};
        int k=6;
        int res=subarrayLCM(a,k);
        System.out.println("Final result "+res);
    }
}
