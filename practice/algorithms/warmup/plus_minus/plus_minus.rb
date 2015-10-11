n = gets.to_s.to_i
arr = gets.to_s.split(" ").map { |s| s.to_i }
positives = 0
negatives = 0
zeroes = 0
for i in arr do
  positives += 1 if i > 0
  negatives += 1 if i < 0
  zeroes += 1 if i == 0
end

puts positives / n.to_f
puts negatives / n.to_f
puts zeroes / n.to_f