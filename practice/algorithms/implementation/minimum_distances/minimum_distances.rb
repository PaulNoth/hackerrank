n = gets.to_i
arr = gets.split(" ").map {|i| i.to_i}
min = 99999999
for i in 0..(n-1)
  for j in (i+1)..n
    min = [min, (j - i).abs].min if (arr[j] == arr[i])
  end
end

min = -1 if(min == 99999999)
puts min