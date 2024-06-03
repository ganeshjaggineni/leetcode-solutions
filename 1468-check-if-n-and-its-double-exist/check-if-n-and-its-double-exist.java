class Solution {
    public boolean checkIfExist(int[] arr) {
        // int len = arr.length;
        // for(int i=0;i<len;i++)
        // {
        //     for(int j=0;j<len;j++)
        //     {
        //         if(arr[i] == 2*arr[j] && i!=j)
        //             return true;
        //     }
        // }
        // return false;

        //METHOD 2 USING HASHMAP
        int len = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++)
        {
                map.put(arr[i],i);
        }
        for(int j=0;j<len;j++)
        {
            if(map.containsKey(2*arr[j]) && map.get(2*arr[j]) != j)
            {
             
                return true;
            }
        }
        return false;
        
    }
    //BY GANESH JAGGINENI
}