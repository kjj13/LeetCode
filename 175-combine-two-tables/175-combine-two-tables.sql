# Write your MySQL query statement below
SELECT P.firstname, P.lastname, A.city, A.state
FROM Person P left join Address A
ON P.personId = A.personId;