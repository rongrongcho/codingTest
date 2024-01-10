SELECT
author.author_id, author.author_name, category, SUM(sales*price)
FROM
author, book_sales, book
WHERE
book.book_id = book_sales.book_id
AND
book.author_id = author.author_id
AND
TO_CHAR(sales_date, 'yyyy-mm') = '2022-01'
GROUP BY
author.author_id, author.author_name, category
ORDER BY
author.author_id ASC,
category DESC;