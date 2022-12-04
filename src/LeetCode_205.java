import java.util.HashMap;
import java.util.HashSet;


public class LeetCode_205 {

    public static boolean isIsomorphic(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n1!=n2)
            return false;
        return true;
    }

    public static void main(String[] args) {
        String s1="egg";
        String s2="gge";
        boolean res=isIsomorphic(s1,s2);
        System.out.println("Final result is " + res);
    }
}
