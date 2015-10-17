n = gets.to_i
leftRight = 0
rightLeft = 0
n.times do |i|
  row = gets.to_s.split(" ").map { |s| s.to_i}
  leftRight += row[i]
  rightLeft += row[n - i - 1]
end

puts (leftRight - rightLeft).abs