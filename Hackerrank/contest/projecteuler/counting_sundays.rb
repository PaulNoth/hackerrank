# Project Euler #19: Counting Sundays
#
# You are given the following information, but you may prefer to do some research for yourself.
# 
# 1 Jan 1900 was a Monday.
# Thirty days has September, 
# April, June and November. All the rest have thirty-one, 
# Saving February alone, 
# Which has twenty-eight, rain or shine. And on leap years, twenty-nine.
# A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
# 
# How many Sundays fell on the first of the month between two dates(both inclusive)?
# 
# Input Format 
# The first line contains an integer T , i.e., number of test cases. 
# Each testcase will contain two lines 
# Y1 M1 D1 on first line denoting starting date 
# Y2 M2 D2 on second line denoting ending date.
# 
# Output Format 
# Print the values corresponding to each test case.

# Constraints 
# 1<=T<=100 
# 1900<=Y1<=1016 
# Y1<=Y2<=(Y1+1000) 
# 1<=M1,M2<=12 
# 1<=D1,D2<=31

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