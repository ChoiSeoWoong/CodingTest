-- 코드를 입력하세요
SELECT a.author_id, a.author_name, b.category, sum(s.sales * b.price) as total_sales
from author as a
         join book as b on a.author_id = b.author_id
         join book_sales as s on b.book_id = s.book_id
where date_format(s.sales_date, '%Y-%m') like '2022-01'
group by a.author_id, b.category
order by a.author_id, b.category desc