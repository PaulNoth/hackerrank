(length, diff) = gets.split.map{|s| s.to_i}
arr = gets.split.map{|s| s.to_i}.sort{|a,b| a <=> b}
pairs = 0
for i in 0...arr.size - 1
  for j in (i+1)...arr.size
    if(arr[j] - arr[i] == diff)
      pairs += 1
      break
    end
  end
end
puts pairs