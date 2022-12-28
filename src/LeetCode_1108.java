public class LeetCode_1108 {

    public static String defangIPaddr(String add) {
         int n=add.length();
        StringBuilder ans=new StringBuilder();
        int i=0;
        int j=0;
        while(j<n) {
            if(add.charAt(j)!='.') {
                j++;
            }
            else {
                ans.append(add.substring(i, j));
                if(j!=n) ans.append("[.]");
                i=j+1;
                j=i;
            }
        }
        System.out.println(i);
        ans.append(add.substring(i,n));
     return ans.toString();
    }

    public static void main(String[] args) {
        String s="227.222.40.237";  //ans=255[.]100[.]50[.]0
        String res=defangIPaddr(s);
        System.out.println("Final result:  " + res);
    }
}
