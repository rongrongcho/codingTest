SELECT TO_NUMBER(TO_CHAR(START_DATE, 'MM')) AS MONTH, a.CAR_ID, count(*) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY a JOIN (
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE TO_CHAR(START_DATE, 'YYYY-MM-DD') BETWEEN '2022-08-01' AND '2022-10-31'
    GROUP BY CAR_ID
    HAVING count(*) >= 5
) b ON a.CAR_ID = b.CAR_ID
WHERE TO_CHAR(START_DATE, 'YYYY-MM-DD') BETWEEN '2022-08-01' AND '2022-10-31'
GROUP BY TO_CHAR(START_DATE, 'MM'), a.CAR_ID
ORDER BY 1, 2 DESC