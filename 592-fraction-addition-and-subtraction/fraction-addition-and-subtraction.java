class Solution {
    public String fractionAddition(String expression) {
        
        // StringBuilder numerator = new StringBuilder();
        // while(expression.charAt(idx) )
        List<Integer> numFrac = new ArrayList<>();
        List<Integer> denFrac = new ArrayList<>();
        List<Character> symbol = new ArrayList<>();
        int i = 0;
        while(i<expression.length())
        {
           
                StringBuilder numerator = new StringBuilder();
                StringBuilder denominator = new StringBuilder();
                char sign = expression.charAt(i);
                 if (sign == '+' || sign == '-') {
                      i++;
                    } else {
                         sign = '+';
                     }
                     symbol.add(sign);
                while(i<expression.length() && expression.charAt(i) != '/')
                {
                    numerator.append(expression.charAt(i));
                    i++;
                }
                i++;
                 while(i<expression.length() && (expression.charAt(i) != '+' && expression.charAt(i) != '-'))
                {
                    denominator.append(expression.charAt(i));
                    i++;
                }
                
                int num = Integer.parseInt(numerator.toString());
            if (sign == '-') {
                num = -num;
            }
            numFrac.add(num);
            
            int denom = Integer.parseInt(denominator.toString());
            denFrac.add(denom);

        }
        System.out.println(numFrac);
        System.out.println(denFrac);
        System.out.println(symbol);

        int commonDen = findLCM(denFrac);
        System.out.println(commonDen);

        int numSum = 0;
        for(int j=0;j<numFrac.size();j++)
        {
            numSum += numFrac.get(j)*(commonDen/denFrac.get(j));
        }
        if(numSum == 0)
            return "0/1";
        
               int gcd = gcd(Math.abs(numSum), commonDen);
        int simplifiedNumerator = numSum / gcd;
        int simplifiedDenominator = commonDen / gcd;
        
        return simplifiedNumerator + "/" + simplifiedDenominator;

        
 
    }
      private static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
      private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
        public static int findLCM(List<Integer> numbers) {
        

        // Initialize LCM with the first number
        int lcm = numbers.get(0);

        // Iterate through the list and calculate LCM iteratively
        for (int i = 1; i < numbers.size(); i++) {
            lcm = lcm(lcm, numbers.get(i));
        }

        return lcm;
    }


}