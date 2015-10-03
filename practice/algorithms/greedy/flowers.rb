(n, k) = gets.chomp.split.map { |e| e.to_i }
prices = gets.chomp.split.map { |e| e.to_i }

prices.sort! { |i,j| j <=> i }
result = 0
n.times do |i|
  factor = i / k
  result += (factor + 1) * prices[i]
end
puts result
