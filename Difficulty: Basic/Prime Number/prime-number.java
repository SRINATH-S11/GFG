class Solution {
    static boolean isPrime(int n)
    {
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            count++;
            if(count> 2)
            
            return false;
            
            
        }
        return true;
        
        }
        
    }