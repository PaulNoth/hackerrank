test_cases = gets.chomp.to_i
test_cases.times do
  array_length = gets.chomp.to_i
  array  = gets.chomp.split.map { |e| e.to_i }
  
  array.sort! { |i,j| j <=> i }
  
  result = 1
  array.each do |element|
    diff = array_length - element
    diff = 0 if diff < 0
    result *= diff
    result %= 1000000007
    array_length -= 1
  end
  puts result
end
