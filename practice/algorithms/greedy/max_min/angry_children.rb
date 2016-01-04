n = gets.to_i
k = gets.to_i
candy = Array.new(n)
for i in 0..n-1
      candy[i] = gets.to_i
end
candy.sort! {|l,j| l <=> j}
unfairness = candy[candy.length - 1]
for i in 0..candy.length - k do
  temp_unfairness = candy[i + k - 1] - candy[i]
  unfairness = temp_unfairness if unfairness > temp_unfairness  
end
puts unfairness

