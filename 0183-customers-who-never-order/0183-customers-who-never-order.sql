# Write your MySQL query statement below
select c.name Customers
from Customers c
left join Orders o
on c.id=o.id
where c.id not in 
                (select customerId
                from Orders);