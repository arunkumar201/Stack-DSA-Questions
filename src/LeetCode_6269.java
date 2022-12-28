public interface LeetCode_6269 {
    public static int closetTarget(String[] a, String target, int startIndex) {
    int n=a.length;
    if(n==1){
        if(a[0]==target)  return 0;
        else return -1;
    }
    int i=startIndex;
    int min1=-1;
    int min2=-1;
   int  k=0;
    int j=n-1;
    int x=0;
    while(i<n){
        if(a[i]==target){
           min1= i;
           break;
        }
        k++;
        i++;
    }
        while(j>=0){
            if(a[j]==target){

              min2= j;
              break;
            }
            x++;
            j--;
        }
        System.out.println(min1 + " " + min2 + " "  );
       return Math.min(k,x);
    }


    public static void main(String[] args) {
        String[] s={"hello","i","am","leetcode","hello"};
//        String [] s={"a","b","leetcode"};
                String target = "hello";
           int startIndex = 1;
           int res=closetTarget(s,target,startIndex);
        System.out.println("Final result: " + res);
    }
}
