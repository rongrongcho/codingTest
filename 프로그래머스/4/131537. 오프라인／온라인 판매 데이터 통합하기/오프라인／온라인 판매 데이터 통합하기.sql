(SELECT TO_CHAR(sales_date, 'YYYY-MM-DD') AS sales_date,
    product_id,
    user_id,
    sales_amount
FROM online_sale
WHERE TO_CHAR(sales_date, 'YYYY-MM') = '2022-03')

UNION

(SELECT TO_CHAR(sales_date, 'YYYY-MM-DD') AS sales_date,
    product_id,
    NULL AS user_id,
    sales_amount
FROM offline_sale
WHERE TO_CHAR(sales_date, 'YYYY-MM') = '2022-03')
ORDER BY sales_date, product_id, user_id;
