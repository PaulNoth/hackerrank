(n, m) = gets.split.map(&:to_i)
a = gets.split.map(&:to_i)
b = gets.split.map(&:to_i)
a_max = a.max
b_min = b.min
all_numbers = (a_max..b_min).to_a
result = all_numbers.select do |num|
  factor_of_a = a.all? { |i| num % i == 0 }
  factor_of_b = b.all? { |j| j % num == 0 }
  factor_of_a && factor_of_b
end

puts result.size