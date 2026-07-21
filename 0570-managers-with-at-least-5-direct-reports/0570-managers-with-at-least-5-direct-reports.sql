/* Write your PL/SQL query statement below */
select name from Employee 
where id in (
    select managerId from (
        select managerId,count(*) as cnt from Employee 
        group by managerId) 
        where cnt>=5
)
