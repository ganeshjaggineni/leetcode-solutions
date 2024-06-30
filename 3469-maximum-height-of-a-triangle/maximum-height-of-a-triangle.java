class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        
        // if(red == 0 && blue == 0)
        //     return 0;
         boolean blue_turn = true;
        boolean red_turn = false;
       
        int blue_turn_height = findHeight(red_turn,blue_turn,red,blue);
        
        
        int red_turn_height = findHeight(true,false,red,blue);

        return (blue_turn_height >= red_turn_height)?blue_turn_height:red_turn_height;
    }
    private static int findHeight(boolean red_turn,boolean blue_turn,int red,int blue)
    {
        int row = 0;
        
        while(blue >= 0 && red >= 0)
        {
            if(blue_turn)
            {
                if(blue-(row+1) >= 0)
                {
                    blue = blue - (row+1);
                    row++;
                    blue_turn = false;
                    red_turn = true;
                }
                else
                    break;
            }
            else if(red_turn)
            {
                 if(red-(row+1) >= 0)
                {
                    red = red - (row+1);
                    row++;
                     red_turn = false;
                    blue_turn = true;
                    
                }
                else
                    break;
            }
        }
         return row;
    }
   
}