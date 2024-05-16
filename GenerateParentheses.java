class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> store = new ArrayList<>();
        int upper_count = 0;
        int lower_count = 0;
        int index = 0;
        char arr[] = new char[n*2];

        Parentheses(upper_count,lower_count,n,index,arr,store);
        return store;
        
    }
    public void Parentheses(int upper_count,int lower_count,int n,int index,char[] arr,List<String> store)
    {
        if(index == 2*n)
        {
        store.add(new String(arr));
        }
        if(upper_count < n)
        {
            arr[index] = '(';
            Parentheses(upper_count+1,lower_count,n,index+1,arr,store);
        }
        if(upper_count> lower_count)
        {
             arr[index] = ')';
             Parentheses(upper_count,lower_count+1,n,index+1,arr,store);
        }
    }
}
