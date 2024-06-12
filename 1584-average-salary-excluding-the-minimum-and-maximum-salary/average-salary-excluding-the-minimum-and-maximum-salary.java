class Solution {
    public double average(int[] salary) {

        double sum = 0;
        int max_salary = Integer.MIN_VALUE;
        int min_salary = Integer.MAX_VALUE;
        int n = salary.length;
       for(int i=0;i<n;i++)
       {
        sum += salary[i];
        if(salary[i] > max_salary)
            max_salary = salary[i];
        if(salary[i] < min_salary)
            min_salary = salary[i];
       }
       double avg = (sum - max_salary-min_salary)/(n-2);
       return avg;
        
    }
}