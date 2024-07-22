class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(heights[j] < heights[j+1])
                {
                    int temp = heights[j+1];
                    heights[j+1] = heights[j];
                    heights[j] = temp;

                    //names array swapping
                    String tempName  = names[j+1];
                    names[j+1] = names[j];
                    names[j] = tempName;  
                }
            }
        }
        // System.out.println(Arrays.toString(heights));
        return names;
    }
    //BY GANESH JAGGINENI
}