(n_jars, operations) = gets.chomp.split.map { |i| i.to_i}
sum = 0
operations.times do
  (a, b, candies) = gets.chomp.split.map { |i| i.to_i}
  sum += ((b - a + 1) * candies)
end
average = sum.to_f / n_jars
answer = average.floor
puts answer