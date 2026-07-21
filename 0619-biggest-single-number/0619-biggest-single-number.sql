/* Write your PL/SQL query statement below */
select max(num) as num from (select num,count(num) as cnt from mynumbers group by num) where cnt=1;