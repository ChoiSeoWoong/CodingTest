SELECT distinct I.flavor from first_half F left join icecream_info I on F.flavor = I.flavor
where total_order > 3000 and ingredient_type = 'fruit_based' order by total_order desc
