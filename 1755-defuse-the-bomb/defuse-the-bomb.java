class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] decrypted_code = new int[n];
        if(k > 0)
        {
            for(int i=0;i<n;i++)
            {
                int sum = 0;
                for(int j=1;j<=k;j++)
                {
                    sum = sum + code[(i+j)%n];
                }
              decrypted_code[i] = sum;
            }
        }
        else if(k < 0)
        {
              for(int i=0;i<n;i++)
            {
                int sum = 0;
                for(int j=-1;j>=k;j--)
                {
                    sum = sum + code[(i+j+n)%n];
                }
              decrypted_code[i] = sum;
            }
        }
        //if k== 0 default array elements in java are initialized to 0
       return decrypted_code; 
    }
    //BY GANESH JAGGINENI
}