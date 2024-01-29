-- 코드를 입력하세요
SELECT fp.product_id, fp.product_name, sum(fp.price * fo.amount) as total_sales
from food_product as fp
         left join food_order as fo
                   on fp.product_id = fo.product_id
where date_format(fo.produce_date, '%Y-%m') like '%2022-05%'
group by fp.product_id
order by total_sales desc, fp.product_id