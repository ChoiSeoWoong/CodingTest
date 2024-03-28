-- 코드를 작성해주세요
select a.id, coalesce(count(b.id), 0) as child_count from ecoli_data as a
left join ecoli_data as b on a.id = b.parent_id
group by a.id
order by a.id