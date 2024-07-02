class Solution {
    public int divisorSubstrings(int num, int k) {

        int cnt = 0;
        String str_num = String.valueOf(num);
        System.out.println("str num "+str_num);
        for(int i=0;i<=str_num.length()-k;i++)
        {
              int ans = 0;
            for(int j=i;j<i+k;j++)
            {
                ans = ans*10+Integer.parseInt(String.valueOf(str_num.charAt(j)));
            }
            System.out.println("ans = "+ans);
            if(ans != 0 && num%ans == 0)
                cnt++;
        }
        return cnt;
        
    }
}