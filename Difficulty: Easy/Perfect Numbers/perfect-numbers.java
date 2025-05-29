

class Solution {
    static boolean isPerfectNumber(int n) {
        int res = 1;
        for(int i = 2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
            res += i;
            if(i != n/i)
            res += n/i;
            }
        }
        return res==n;
    }
};