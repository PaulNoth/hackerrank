def prove(arr1, arr2, sum)
  for i in 0..arr1.length - 1 do
    return "NO" if arr1[i] + arr2[i] < sum
  end
  return "YES"
end

test_cases = gets.chomp.to_i
test_cases.times do
  (arr_length, sum) = gets.chomp.split.map { |e| e.to_i}
  arr1 = gets.chomp.split.map { |e| e.to_i}
  arr2 = gets.chomp.split.map { |e| e.to_i}
  arr1.sort! {|i, j| i <=> j}
  arr2.sort! { |i, j| j <=> i}
  puts prove(arr1, arr2, sum)
end