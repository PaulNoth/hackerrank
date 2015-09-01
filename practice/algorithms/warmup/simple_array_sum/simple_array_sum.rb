n = gets.to_i
arr = gets.split(" ").map { |c| c.to_i }
sum = 0
for i in arr do
  sum += i
end
puts sum