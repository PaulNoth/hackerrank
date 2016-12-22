(s, e, d) = gets.strip.split.map(&:to_i)

count = 0
for i in s..e do
  reversed = i.to_s.reverse
  count += 1 if (i - reversed.to_i).abs % d == 0
end

puts count