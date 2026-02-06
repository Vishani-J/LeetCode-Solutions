# Write your MySQL query statement below
select m.name Employee
from Employee e
join Employee m
on e.id=m.managerId
where e.salary<m.salary;
