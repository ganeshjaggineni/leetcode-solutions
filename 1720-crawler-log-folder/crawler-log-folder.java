class Solution {
    public int minOperations(String[] logs) {

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
    }
}