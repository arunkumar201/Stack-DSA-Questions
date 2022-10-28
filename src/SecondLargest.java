public class SecondLargest
{
    static  int SecondLargestM_1(int []a,int n) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
//        int min1=Integer.MAX_VALUE;
//        int min2=Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            }
//            else if (a[i]>max2 && a[i] != max1){
//                max2 = a[i];
//            }

        }

        return max2;
    }
static  int SecondLargestM_2(int []a,int n) {
    if(n<2){
        return Integer.MAX_VALUE;
    }
    //Firstly we need to determine the largest element in the array
    int largest=Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
        if(a[i]>largest){
            largest = a[i];
        }
    }
   int SecondLargest=Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
        if(a[i]!=largest){
            if(a[i]>SecondLargest){
                SecondLargest = a[i];
            }
        }
    }
    return SecondLargest;
}

    public static void main(String[] args) {
        int arr[]={1,5,9,9,7};

        int n=arr.length;
        int ans1=SecondLargestM_1(arr,n);
        int ans2=SecondLargestM_2(arr,n);
        System.out.println("Second Largest Element is:"+ans1);
        System.out.println("Second Largest Element is:"+ans2);
    }
}


