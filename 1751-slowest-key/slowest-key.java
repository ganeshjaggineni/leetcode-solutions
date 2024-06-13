class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {

        int i = 0;
        int max_time = releaseTimes[0];
        char long_press_key = ' ';
        int time = 0;
        for(char ch : keysPressed.toCharArray())
        {

            if(i==0)
                time = releaseTimes[0];
            else
                time = releaseTimes[i]-releaseTimes[i-1];

            
             if(time>= max_time)
            {
               
               if(time == max_time)
               {
                if(ch > long_press_key)
                {
                  long_press_key = ch;

                }
               }
               else
               {
                long_press_key = ch;
               }
                max_time  = time;
                
            }
            i++;
        }
        return long_press_key;
        
    }
    //BY GANESH JAGGINENI
}