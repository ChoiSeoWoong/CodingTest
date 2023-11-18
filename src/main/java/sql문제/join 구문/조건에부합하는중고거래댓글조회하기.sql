SELECT title, B.board_id, reply_id, R.writer_id, R.contents, date_format(R.created_date, '%Y-%m-%d') as created_date
from used_goods_reply R left join used_goods_board B on R.board_id = B.board_id
where date_format(B.created_date, '%Y-%m') = '2022-10' order by R.created_date, title
