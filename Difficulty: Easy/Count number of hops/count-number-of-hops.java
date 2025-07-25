// User function Template for Java

class Solution {
    // Function to count the number of ways in which frog can reach the top.
    static int countWays(int n) {
        if (n < 0)
        return 0;
        if (n == 0) 
        return 1;
        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
    }
}
