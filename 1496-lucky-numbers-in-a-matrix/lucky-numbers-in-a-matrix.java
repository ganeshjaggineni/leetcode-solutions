class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        for(int i=0;i<matrix.length;i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]< min)
                    {
                        min = matrix[i][j];
                    }
            }
            set1.add(min);
        }
        // System.out.println(set1);

            for(int j=0;j<matrix[0].length;j++)
            {
               int max = Integer.MIN_VALUE;
             for(int i=0;i<matrix.length;i++)
            {
                 if(matrix[i][j] > max)
                {
                   
                    max = matrix[i][j];
                    // System.out.println(max);
                }
            }
            if(set1.contains(max))
            {

                // System.out.println(max);
                list.add(max);
            }

            

         }
           
        
    return list;   
    }
}