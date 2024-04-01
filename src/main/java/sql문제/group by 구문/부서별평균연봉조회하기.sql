-- 코드를 작성해주세요
select d.dept_id, d.dept_name_en, round(avg(e.sal)) as avg_sal from hr_department as d
join hr_employees as e on d.dept_id = e.dept_id
group by 1, 2
order by 3 desc