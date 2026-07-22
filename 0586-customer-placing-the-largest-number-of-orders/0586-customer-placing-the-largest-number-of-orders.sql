/* Write your PL/SQL query statement below */
select cn as customer_number from (
    
   select customer_number as cn,count(customer_number) as cnt from Orders group by customer_number order by cnt desc 
)where rownum=1;