class Solution {
    public int minOperations(String[] logs) {
//METHOD 1 : USING STACK
/*
        Stack<Integer> st = new Stack<>();
        int temp = 0;
        st.add(temp);
        for(int i=0;i<logs.length;i++)
        {
            if(logs[i].equals("../"))
            {
                if(st.peek() != 0)
                {
                st.pop();
                temp--;
                }
            }
            else if(logs[i].equals("./"))
                continue;
            else
            {
                temp = temp+1;
                st.add(temp);
            }
        }

        return st.peek();
        */

//METHOD 2 : WITHOUT USING STACK
        int depth = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                if (depth != 0)
                    depth--;
            } else if (!logs[i].equals("./"))
                depth++;

        }

        return depth;
    }
    // BY GANESH JAGGINENI
}