// User function Template for Java

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        
        if (Arrays.equals(a, b)) 
        {
            return true;
        }
        else
        return false;
        
    }
}