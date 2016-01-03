def get_position(arr, val)
  (arr.size - 1).times do |i|
    return i if(val == arr[i])
  end
end

searched_value = gets.to_s.chomp.to_i
array_length = gets.to_s.chomp.to_i
arr = gets.to_s.split.map{ |i| i.to_i }

position = get_position(arr, searched_value)
puts position