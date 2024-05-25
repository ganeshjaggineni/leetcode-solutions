/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        int mid = 0;
        while(low<=high)
        {
            mid = low+(high-low)/2;
            int picked = guess(mid); 
            if(picked == 0)
            {
              return mid;
                
            }
            else if(picked == -1)
                high = mid-1;
            else if(picked == 1)
                low = mid+1;
        }
      return -1;
    }
    //BY GANESH JAGGINENI
}