class Solution {
    public String reverseParentheses(String s) {
        
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
    }
    //BY GANESH JAGGINENI
}