class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        int[] res = new int[n+1];
        List<Integer> list = new ArrayList<>();
        for(int num : arr)
        {
            if(num >= 1 && num <= n)
                res[num] += 1;
        }
        
        for(int i = 1;i <= n;i++)
        {
            list.add(res[i]);
        }  
        return list;
    }
}
