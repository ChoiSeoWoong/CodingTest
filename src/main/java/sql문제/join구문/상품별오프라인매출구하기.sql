-- 코드를 입력하세요
SELECT p.product_code, sum(o.sales_amount * p.price) as sales from product as p
left join offline_sale as o on p.product_id = o.product_id
group by p.product_code order by 2 desc, 1;