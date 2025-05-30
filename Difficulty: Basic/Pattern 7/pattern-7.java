class Solution {

    void printTriangle(int n) {
        for(int i = 1;i<=n;i++)
        {
            for(int j = 0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k = i; k>=1;k--)
            {
                System.out.print("*");
            }
            for(int k = 2;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}