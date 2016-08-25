(n, divisor) = gets.split(" ").map {|i| i.to_i}
array = gets.split(" ").map {|i| i.to_i}
count = 0
for a in 0..(n-2) do
  for j in (a+1)..(n-1) do
    count += 1 if ((array[a] + array[j]) % divisor == 0)
  end
end

puts count