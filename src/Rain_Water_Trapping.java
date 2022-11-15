import java.util.Arrays;

public class Rain_Water_Trapping {
    public static int trap_SC_ON(int[] a) {
        //a is a Height Array
       int n=a.length;
       if(n==0 || n==1){
           return 0;
       }
       int max_Left[]=new int[n];
       int max_Right[]=new int[n];
        max_Left[0]=a[0];
        int max_L=max_Left[0];
        //Calculate Max from Left for each tower
       for(int i=1;i<n;i++){
           if(a[i]<=max_L){
               max_Left[i] =max_L;
           }else{
               max_L=a[i];
               max_Left[i] =max_L;
           }
       }
       max_Right[n-1]=a[n-1];
       int max_R=max_Right[n-1];
       for(int i=n-2;i>=0;i--){
           if(a[i]<=max_R) {
               max_Right[i] = max_R;
           }
               else {
                   max_R=a[i];
                   max_Right[i] =max_R;
               }
       }
//        System.out.println(Arrays.toString(max_Left));
//        System.out.println(Arrays.toString(max_Right));
      int min[]=new int[n];
       int Max_TrappedWater=0;
       for(int i=0;i<n;i++){
           min[i]=Math.min(max_Left[i],max_Right[i]);
           Max_TrappedWater+=min[i]-a[i];
//           System.out.println(min[i]);
       }
       return Max_TrappedWater;
    }

    public static  int trap(int [] a){
        int n=a.length;
        if(n<=2){
            return 0;
        }
        int maxTrappedWater=0;
        int left=0;
        int right=n-1;
        int leftMaxHeight=0;
        int rightMaxHeight=0;
        while (left <= right) {
            if(a[left]< a[right]) {
                if (a[left] >leftMaxHeight) {
                    leftMaxHeight = a[left];
                } else {
                    maxTrappedWater += leftMaxHeight - a[left];
                    left++;
                }
            }
            else {
                    if (a[right]>rightMaxHeight) {
                        rightMaxHeight = a[right];

                    } else {
                        maxTrappedWater += rightMaxHeight - a[right];
                        right--;
                    }
            }

            }
        return maxTrappedWater;
    }

    public static void main(String[] args) {
        int a[]={3,0,0,2,0,4};
        int res=trap(a);
        System.out.println("Final result:" + res);
    }
}
