// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // int dp{31};
        // int dp[0] = 0;
        // int dp[1] = 1;
        
        // for(int i = 2; i<=n ; i++)
        // {
        //     dp[i] = dp[i-1] + dp[i-2];
        // }
        // return dp[i];
        if(n == 0)return 0;
        if(n == 1)return 1;
        return  nthFibonacci(n-1) +  nthFibonacci(n-2);
    }
}