class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();
        int total_candies = 0;
        int max_candies = 0;
        for(int i=0;i<candies.length;i++)
        {
            total_candies = candies[i]+extraCandies;
            for(int j=0;j<candies.length;j++)
            {
                if(candies[j] >= max_candies)
                    max_candies = candies[j];
            }
            if(total_candies >= max_candies)
                list.add(true);
            else
                list.add(false);
        }
     return list;   
    }
    //BY GANESH JAGGINENI
}