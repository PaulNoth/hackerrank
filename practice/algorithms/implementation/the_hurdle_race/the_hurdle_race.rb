(n, k) = gets.split.map(&:to_i)
heights = gets.split.map(&:to_i)
max_height = heights.max

beverages = 0
beverages = (max_height - k) if max_height > k

puts beverages