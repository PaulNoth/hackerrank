def kadane(arr)
  maxSoFar = arr[0]
  maxEndings = arr[0]
  arr.each do |el|
    maxEndings = [el, maxEndings + el].max
    maxSoFar = [maxSoFar, maxEndings].max
  end
  maxSoFar
end

tests = gets.to_i
tests.times do |i|
  n = gets.to_i
  arr = gets.split.map{ |i| i.to_i}
  contiguous_sum = kadane(arr)
  positive_numbers = arr.select { |el| el > 0}
  non_contiguous_sum = 0
  if(positive_numbers.size == 0)
    non_contiguous_sum = arr.max
  else
    positive_numbers.each {|el| non_contiguous_sum += el}
  end
  puts "#{contiguous_sum} #{non_contiguous_sum}"
end