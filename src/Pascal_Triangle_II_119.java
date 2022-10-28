import java.util.*;

public class Pascal_Triangle_II_119 {

    public static List<Integer> getRow(int n) {
        List<Integer> li=new ArrayList<>();
        if(n==0){
       li.add(1);
       return li;
        }
        if (n == 1) {
            li.add(1);
            li.add(1);
            return li;
        }

        int [][]a=new int[n+1][n+1];
         int i=0,j=0;
        for(i=0;i<=n;i++) {
            for (j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = (a[i - 1][j - 1]) + (a[i - 1][j]);
                }
            }

        }
        for(int k=0;k<=n;k++){
           li.add(a[n][k]) ;
        }

        return  li;
    }






    public static void main(String[] args) {
        int RowIndex;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row index of the Pascal_Triangle:");
        RowIndex=sc.nextInt();
        List<Integer> res= new ArrayList<Integer>();
        res=getRow(RowIndex);
        System.out.println("Final Result: "+res);

    }



}
