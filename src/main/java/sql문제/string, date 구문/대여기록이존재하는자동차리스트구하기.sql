-- 코드를 입력하세요
SELECT distinct(crcc.car_id) as car_id from car_rental_company_car as crcc
left join car_rental_company_rental_history as crcrh on crcc.car_id = crcrh.car_id
where crcc.car_type like '%세단%' and date_format(crcrh.start_date, '%Y-%m') like '%2022-10%'
order by car_id desc