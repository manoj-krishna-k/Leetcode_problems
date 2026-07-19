/* Write your PL/SQL query statement below */
select p1.name as Employee from Employee p1 where p1.salary>(select salary from Employee where id=p1.managerId);
