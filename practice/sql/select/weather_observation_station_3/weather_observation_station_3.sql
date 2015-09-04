select distinct city 
  from station 
where 
  MOD(id, 2) = 0
order by city asc; 