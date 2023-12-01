SELECT *
FROM PLACES PL1 
WHERE PL1.HOST_ID IN 
(SELECT HOST_ID
FROM PLACES
GROUP BY HOST_ID
HAVING COUNT(*) > 1)
ORDER BY ID;
