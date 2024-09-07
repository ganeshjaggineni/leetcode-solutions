# Write your MySQL query statement below
SELECT MAX(num) as num from MyNumbers where num in (SELECT num FROM MyNumbers group by num having COUNT(num) = 1);