balls = gets.chomp.to_i
expected_num = 0
balls.times do
  input = gets.chomp.to_i
  expected_num += input
end
expected_num /= 2.0
puts "#{format('%.1f', expected_num)}"
