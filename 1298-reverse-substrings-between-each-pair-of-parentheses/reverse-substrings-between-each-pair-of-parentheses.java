class Solution {
    public String reverseParentheses(String s) {
      /*  
        Stack<Character> st = new Stack<>();
           for(int i=0;i<s.length();i++)
           {
                char ch = s.charAt(i);
                if(ch == ')')
                {
                    StringBuilder temp = new StringBuilder();
                    while(st.peek() != '(')
                    {
                        temp.append(st.pop());
                        
                    }
                    st.pop();
                    // temp = temp.reverse();
                    for(char chr:temp.toString().toCharArray())
                    {
                        st.push(chr);
                    }

                }
                else
                {
                    st.push(ch);
                }
           }
           StringBuilder newstring = new StringBuilder();
           while(!st.isEmpty())
           {
             newstring.append(st.pop());
           }
           return newstring.reverse().toString();
    
    */
    //2nd method USING STACK  and storing indices of res string
    /*
    Stack<Integer> openidx = new Stack<>();
    StringBuilder res = new StringBuilder();

    for(char ch:s.toCharArray())
    {
        if(ch == '(')
            openidx.push(res.length());
        else if(ch == ')')
        {
            int start_pos = openidx.pop();
            reverse(res,start_pos,res.length()-1);
        }
        else
        {
            res.append(ch);
        }
    }
    return res.toString();
    */
    //BY GANESH JAGGINENI

    //method 3 WORMHOLE TELEPORTATION METHOD
    Stack<Integer> openidxfinder = new Stack<>();
    int n = s.length();
    int[] pair = new int[n];
    Arrays.fill(pair, -1);
    for(int i=0;i<n;i++)
    {
        if(s.charAt(i) == '(')
            openidxfinder.push(i);
        else if(s.charAt(i) == ')')
        {
            int top_open_brace = openidxfinder.pop();
            pair[top_open_brace] = i;
            pair[i] = top_open_brace;
            
        }
    }
    int curr_idx = 0;
    int dir = 1;
    StringBuilder ans = new StringBuilder();

    while(curr_idx < n)
    {
        char ch = s.charAt(curr_idx);
        if( ch == '(' || ch == ')')
        {
            
            curr_idx = pair[curr_idx];
            dir = dir*-1;
        }
        else
            ans.append(ch);

        curr_idx = curr_idx + dir;
    }
    return ans.toString();
}
/*
 private void reverse(StringBuilder sb,int start,int end)
 {
    while(start<end)
    {
        char temp = sb.charAt(start);
        sb.setCharAt(start,sb.charAt(end));
        sb.setCharAt(end,temp);
        start++;
        end--;

    }
 }

*/

}