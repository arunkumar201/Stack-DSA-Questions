import java.util.HashSet;

public class LeetCode_1704 {
    public static boolean halvesAreAlike_BruteForce(String s) {
        //SImple and Easy Approach to solve this problem,
        int n=s.length();
        HashSet<Character> hs=new HashSet<>();
        int i=0;
        hs.add('a');
        hs.add('A');
        hs.add('I');
        hs.add('i');
        hs.add('o');
        hs.add('O');
        hs.add('U');
        hs.add('u');
        hs.add('e');
        hs.add('E');

        int l=0;
        int h=n-1;
        int Vowels_Left =0;
        int Vowels_Right=0;
        while(l<h){
           if(hs.contains(s.charAt(l))){
               Vowels_Left++;
           }
           if(hs.contains(s.charAt(h))){
               Vowels_Right++;
           }
           l++;
           h--;
        }
        if(Vowels_Left==Vowels_Right) return true;
        return false;
    }



    private  static  boolean isVowels(char c) {
        char ch=Character.toUpperCase(c);  //or char ch=c-32;
        return (ch=='A' || ch=='I' || ch=='O' || ch=='U' || ch=='E');
    }
    public static boolean halvesAreAlike(String s){
        int n=s.length();
        int l=0;
        int h=n-1;
        int Vowels_Left =0;
        int Vowels_Right=n-1;
        while(l<h){
            if(isVowels(s.charAt(l))){
                Vowels_Left++;
            }
            if(isVowels(s.charAt(h))){
                Vowels_Right++;
            }
            l++;
            h--;
        }
        if(Vowels_Left==Vowels_Right) return true;
        return false;
    }

    public static boolean halvesAreAlike_Optimal(String s){
        int n=s.length();
        int Vowels_Left =0;
        int Vowels_Right=0;
       for(int i=0;i<n/2;i++){
            if(isVowels(s.charAt(i))){
                Vowels_Left++;
            }
            if(isVowels(s.charAt(n-1-i))){
                Vowels_Right++;
            }
        }
        if(Vowels_Left==Vowels_Right) return true;
        return false;
    }
    public static void main(String[] args) {
        String s="book"; //true
//        String s="textbook"; //false
        boolean res=halvesAreAlike_Optimal(s);
        System.out.println("Final result: " + res);
    }
}
