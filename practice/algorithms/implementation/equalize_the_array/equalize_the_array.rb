n = gets.strip.to_i
arr = gets.strip.split

num_counts = Hash.new
arr.each do |num|
  count = 0
    count = num_counts[num] if num_counts.has_key?(num)
  num_counts[num] = count + 1
end

max_count = 0
num_counts.each_key do |key|
  count = num_counts[key]
  max_count = count if count > max_count
end

puts n - max_count