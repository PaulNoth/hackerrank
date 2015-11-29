(actual_day, actual_month, actual_year) = gets.to_s.split(" ").map { |s| s.to_i }
(expected_day, expected_month, expected_year) = gets.to_s.split(" ").map { |s| s.to_i }

year_diff = actual_year - expected_year
month_diff = actual_month - expected_month
day_diff = actual_day - expected_day

def fee(year, month, day)
  if year > 0
    return 10000
  end
  if year == 0 && month > 0
    return month * 500
  end
  if year == 0 && month == 0 && day > 0
    return day * 15
  end
  return 0
end

puts fee(year_diff, month_diff, day_diff)