require 'date'

def create_next_start_month(year, month, day)
  if day != 1
    day = 1
    if month == 12
      month = 1
      year += 1
    else
      month += 1
    end
  end
  return Date.new(year, month, day)
end

def valid_date?(year, month, day)
  return false if month > 12
  max_days = month_days(year, month)
  return false if day > max_days
  return true
end
 
def month_days(year, month)
  case month
  when 1, 3, 5, 7, 8, 10, 12
    return 31
  when 4, 6, 9, 11
    return 30
  else
    if is_leap(year)
      return 29
    else
      return 28
    end
  end
end

def is_leap(year)
  return year % 400 == 0 if year % 100 == 0
  return year % 4 == 0
end

def create_valid_date(year, month, day)
  new_day = nil
  new_month = nil
  new_year = year
  if month > 12
    new_month = month - 12
    new_year += 1
  else
    new_month = month
  end
    
  max_days = month_days(new_year, new_month)
  new_day = day
  if(max_days < new_day)
    new_day = new_day - max_days
    new_month = new_month + 1
  end
  if(new_month > 12)
    new_month = new_month - 12
    new_year += 1
  end
  return new_year, new_month, new_day
end

def count_sundays(date_from, date_to)
  n = 1
  sundays = 0
  temp_date = Date.new(date_from.year, date_from.mon, date_from.day)
  while (temp_date <=> date_to) <= 0
    sundays += 1 if temp_date.wday == 0
    temp_date = date_from >> n
    n += 1
  end
  return sundays
end

gets.chomp.to_i.times do
  (year, month, day) = gets.chomp.split.map{ |e| e.to_i }
  if valid_date?(year, month, day)
    date_from = create_next_start_month(year, month, day)
  else
    (year, month, day) = create_valid_date(year, month, day)
    date_from = create_next_start_month(year, month, day)
  end
  
  (year, month, day) = gets.chomp.split.map{ |e| e.to_i }
  if valid_date?(year, month, day)
    date_to = Date.new(year, month, day)
  else
    (year, month, day) = create_valid_date(year, month, day)
    date_to = Date.new(year, month, day)
  end
  puts count_sundays(date_from, date_to)
end