class Solution {
    void selectionSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++)
        {
            int min_Index = i;

            for (int j = i + 1; j < size; j++)
            {
                if (arr[min_Index] > arr[j])
                {
                    min_Index = j;
                }
            }
            int temp = arr[min_Index];
            arr[min_Index] = arr[i];
            arr[i] = temp;
        }
    }
}
