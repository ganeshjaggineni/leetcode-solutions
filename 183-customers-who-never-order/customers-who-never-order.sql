# Write your MySQL query statement below
select Customers.name as Customers from Customers where id not in (select Orders.customerId from Customers,Orders where Customers.id = Orders.CustomerId);