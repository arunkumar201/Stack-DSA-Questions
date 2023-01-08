package BiweeklyContest94;

import java.util.HashMap;

//https://leetcode.com/contest/biweekly-contest-95/
public class biweekly_contest95 {

//    public static  String categorizeBox(int length, int width, int height, int mass) {
//       int x=10000;
//       boolean c=true;
//      long v=(long) width*height*length;
//        if(v>=1000000000) c=true;
//        else c=false;
//       boolean b=((length>=x || width>=x || height>=x) || c);
//        if(b && mass>=100){
//            return "Both";
//        }
//       if(!b && mass<100){
//            return "Neither";
//        }
//
//       if(b && mass<100){
//            if(b && mass<100){
//               return "Bulky";
//           }
//       }
//      else if(!b && mass>=100){
//          if(mass>=100 && !b){
//              return "Heavy";
//          }
//      }
//        return "";
//    }


    public  static  int xorBeauty(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
                    result ^=nums[i];
                }
        return result;
    }
    public static void main(String[] args) {

        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();

      if(mp.containsValue(num))
int length = 3223, width = 1271, height = 2418, mass = 749;
//long l=()2909*2968*3272*1L;
//        System.out.println(l);
// String res=categorizeBox(length, width, height, mass);
//        int a[]={15,45,20,2,34,35,5,44,32,30};
          int a[]={1,4};
//                int res=xorBeauty(a);

        int res=
        System.out.println(res);
    }


}
