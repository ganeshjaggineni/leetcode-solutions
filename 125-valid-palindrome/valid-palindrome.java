class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        System.out.println(s);

    //    if( s.charAt(p1) >= 'a' && s.charAt(p1)<='z')
           int  p1 = 0;
            int p2 = s.length()-1;

        while(p1<p2)
        {

           while(p1<p2 && !Character.isLetterOrDigit(s.charAt(p1)))
                p1++;
            while(p1<p2 && !Character.isLetterOrDigit(s.charAt(p2)))
                p2--;

            if(s.charAt(p1) != s.charAt(p2))
                return false;

            p1++;
            p2--;
        }

        return true;
        
    }
    //BY GANESH JAGGINENI
}