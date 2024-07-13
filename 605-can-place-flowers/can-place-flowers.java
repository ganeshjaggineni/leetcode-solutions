class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int cnt = 0;
        int len = flowerbed.length;
      
        if(n== 1 && len == 1 && flowerbed[0] == 0 )
            return true;
       
            
     
        for(int i=0;i<flowerbed.length-1;i++)
        {
              
         if(i==0)
        {
            if(flowerbed[0] == 0 && flowerbed[1] != 1)
            {
                flowerbed[0] = 1;
                cnt++;
            }
        }
        else if(flowerbed[len-1] == 0 && flowerbed[len-2] == 0)
            {
                flowerbed[len-1] = 1;
                cnt++;
            }
           else if(flowerbed[i] == 0 && (flowerbed[i-1] != 1 && flowerbed[i+1] != 1))
            {
                flowerbed[i] = 1;
                cnt++;
            }

        }
        if(cnt >= n)
            return true;
        return false;
         
        
    }
}