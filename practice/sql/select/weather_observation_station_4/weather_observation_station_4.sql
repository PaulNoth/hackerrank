select num - num_uniq
from (
    select count(city) as num, count(distinct city) as num_uniq 
    from station
);