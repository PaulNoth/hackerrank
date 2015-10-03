cases = gets.chomp.to_i
cases.times do
  result = 1
  towns = gets.chomp.to_i
  routes = gets.chomp.split.map { |e| e.to_i }
  for i in 0..towns - 2 do
    result *= routes[i]
    result %= 1234567
  end
  puts result 
end