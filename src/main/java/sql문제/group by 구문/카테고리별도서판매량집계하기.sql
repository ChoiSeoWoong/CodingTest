-- 코드를 입력하세요
SELECT b.category, sum(bs.sales) as total_sales from book b
left join book_sales bs on b.book_id = bs.book_id
where bs.sales_date like "2022-01%"
group by 1 order by 1