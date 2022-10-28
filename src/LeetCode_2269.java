class LeetCode_2269{
        public static  int divisorSubstrings(int n, int k) {
            if(n<10 && k==1){
                return 1;
            }
            String s=Integer.toString(n);
            int count=0;
            for(int i=0;i<=s.length()-k;i++){
                String str=s.substring(i,i+k);
                String newstr=removeLeadingZeros(str);
                int n1=Integer.parseInt(newstr);
                if(n1!=0 && n%n1==0){
                    count++;
                }
            }
            return count;
        }
        public static String removeLeadingZeros(String str){
            String newstr = "";
            int ind = 0;
            for (int i = 0; i < str.length(); i++) {
                char p = str.charAt(i);
                if (p != '0') {
                    ind = i;
                    break;
                }
            }
            newstr = str.substring(ind, str.length());
            return newstr;
        }
    public static void main(String[] args) {
       int n=240;
        int k=2;
        int res=divisorSubstrings(n,k);
        System.out.println("Final Result:"+res);
    }
}
