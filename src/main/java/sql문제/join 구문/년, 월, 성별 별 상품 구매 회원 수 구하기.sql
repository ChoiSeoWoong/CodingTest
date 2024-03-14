-- 코드를 입력하세요
SELECT year(sales_date) as year, month(sales_date) as month,
    gender, count(distinct(s.user_id)) as users from user_info as i
    join online_sale as s on i.user_id = s.user_id
where gender is not null
group by year, month, gender
order by year, month, gender