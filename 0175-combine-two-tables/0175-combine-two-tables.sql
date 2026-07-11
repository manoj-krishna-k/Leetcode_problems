/* Write your PL/SQL query statement below */
select firstName,lastName,city,B.state from Person A left outer join Address B on A.personId=B.personId;