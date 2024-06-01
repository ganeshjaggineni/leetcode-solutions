class Solution {
    public String toLowerCase(String s) {
        
        char[] char_arr = s.toCharArray();
        for(int i=0;i<char_arr.length;i++)
        {
            if(char_arr[i] >= 'A' && char_arr[i] <= 'Z')
                char_arr[i] += 32;
        }
        return String.valueOf(char_arr);
    }
    //BY GANESH JAGGINENI
}