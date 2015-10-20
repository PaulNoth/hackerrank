select name from 
(
    select name, substr(name, length(name)-2) as sub_name 
    from Students
    where marks > 75 order by sub_name, id asc
);
