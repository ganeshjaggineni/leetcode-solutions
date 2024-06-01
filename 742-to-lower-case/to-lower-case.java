class Solution {
    public String toLowerCase(String s) {
        
        //method 1 using character arrays
        // char[] char_arr = s.toCharArray();
        // for(int i=0;i<char_arr.length;i++)
        // {
        //     if(char_arr[i] >= 'A' && char_arr[i] <= 'Z')
        //         char_arr[i] += 32;
        // }
        // return String.valueOf(char_arr);

        StringBuilder str = new StringBuilder(s);
         for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                str.setCharAt(i,(char)(str.charAt(i)+32));
        }
        return str.toString();
    }
    //BY GANESH JAGGINENI
}