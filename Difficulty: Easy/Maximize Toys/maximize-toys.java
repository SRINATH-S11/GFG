// User function Template for Java

class Solution {
    static int toyCount(int N, int K, int arr[]) {
        Arrays.sort(arr);
        int count = 0;
        int temp = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            if(temp + arr[i] <= K)
            {
                temp +=arr[i];
                count++;
            }
            else
            break;
        }
        return count;
    }
}