// User function Template for Java

class Solution {
    public int minOperation(int n) {
        if(n==0)
        return 0;
        
        int count = 0;
        
        while(n>0)
        {
            if(n%2==0)
            {
            n=n/2;
            count++;
            }
            else
            {
            n=n-1;
            count++;
            }
        }
        return count;
    }
}