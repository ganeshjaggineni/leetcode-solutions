class Solution {
    public int[] shuffle(int[] nums, int n) {
       
        int res[] = new int[2*n];
        int i = 0;
        int p1 = 0;
        int p2 = n;
        int ind = 0;
        while(i<n)
        {
            res[ind++] = nums[p1];
            res[ind++] = nums[p2];
            p1++;
            p2++;
            i++;
        }    
        return res;    
    }
    //BY GANESH JAGGINENI
}