tests = gets.to_i
tests.times do
  arr = gets.to_s.split.map{|s| s.to_i}.sort{|a, b| a <=> b}
  min_diff = 100000000;
  for i in 0...(arr.size - 1)
    diff = arr[i + 1] - arr[i]
    min_diff = diff if(diff < min_diff)
  end
  elements = []
  for i in 0...(arr.size - 1)
    diff = arr[i + 1] - arr[i]
    if(diff == min_diff)
      elements << arr[i]
      elements << arr[i + 1]
    end
  end
  elements.sort!{|a, b| a <=> b}
  puts elements.join(" ")
end