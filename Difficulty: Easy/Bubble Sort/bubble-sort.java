class Solution {
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[])
    {
        int size = arr.length;
        
        for(int i = 0;i < size;i++)
        {
            for(int j = 1;j < size-i;j++)
            {
                if(arr[j-1] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}