/* Write your PL/SQL query statement below */
select o.name as Customers from customers o where id not in (select customerId from Orders);