# Write your MySQL query statement below
SELECT max(salary) as SecondHighestSalary from Employee where salary < (SELECT max(salary) FROM Employee);
