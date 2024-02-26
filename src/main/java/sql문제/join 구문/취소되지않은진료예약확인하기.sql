-- 코드를 입력하세요
SELECT ap.apnt_no, p.pt_name, p.pt_no, d.mcdp_cd, d.dr_name, ap.apnt_ymd
from patient as p
         join appointment as ap on p.pt_no = ap.pt_no
         join doctor as d on d.dr_id = ap.mddr_id
where ap.apnt_ymd like '2022-04-13%'
  and d.mcdp_cd like 'CS'
  and ap.apnt_cncl_yn like 'N'
order by apnt_ymd