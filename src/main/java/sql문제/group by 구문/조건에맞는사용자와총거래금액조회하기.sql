-- 코드를 입력하세요
SELECT ugu.user_id, ugu.nickname, sum(ugb.price) as total_sales
from used_goods_board as ugb left join used_goods_user as ugu on ugb.writer_id = ugu.user_id
where ugb.status like 'DONE'
group by ugu.user_id having total_sales >= 700000
order by total_sales