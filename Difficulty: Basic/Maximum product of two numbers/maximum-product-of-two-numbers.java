
class Solution {
    public static int maxProduct(int[] arr) {
        Arrays.sort(arr);
        
        int n = arr.length;
        
        int a = arr[n-1] * arr[n-2];
        int b = arr[0] * arr[1];
        
        int res = Math.max(a,b);
        return(res);
        
    }
}
