public class Count_SetBit_N {

    static int getSetBits(int n) {
        int setBits = 0;
        int i = 0;
        while (i<=n)  //TC=O(N)
        {
            int j=i;
            while (j != 0) //TC O(32)
                //runs exactly same same as number of set bits in each j
            {
                j = j & (j - 1);
                setBits++;
            }
            i++;

        }
        return setBits;
    }
    public static void main(String[] args) {
        int n=4;
        int res=getSetBits(n);
        System.out.println("Final Result: " + res);
    }
}
