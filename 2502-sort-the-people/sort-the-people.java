class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        /*  METHOD 1 USING BUBBLE SORT
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

        */
        //METHOD 2 USING HASHMAP & SORTING

        Map<Integer,String> htToNamesMap = new HashMap<>();
        int people_cnt = names.length;
        for(int i=0;i<people_cnt;i++)
        {
            htToNamesMap.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] sortedNames = new String[people_cnt];

        for(int i=people_cnt-1;i>=0;i--)
        {
            sortedNames[people_cnt-i-1] = htToNamesMap.get(heights[i]);
        }
        return sortedNames;
    }
    //BY GANESH JAGGINENI
}