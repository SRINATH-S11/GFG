// User function Template for Java
class Solution {
    static int countFactors(int N) {
        int count = 0;
        for(int i = 1;i<=N;i++)
        {
            if(N%i==0)
            count++;
        }
        return count;
    }
}