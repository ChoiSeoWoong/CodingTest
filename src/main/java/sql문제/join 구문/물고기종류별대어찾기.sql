-- 코드를 작성해주세요
select fi.id as id, fni.fish_name as fish_name, fi.length as length
from fish_info as fi
join
(select fish_type, max(length) as max_length
from fish_info
group by fish_type) as fig
on fi.fish_type = fig.fish_type and fi.length = fig.max_length
join
fish_name_info as fni
on fni.fish_type = fi.fish_type
order by 1