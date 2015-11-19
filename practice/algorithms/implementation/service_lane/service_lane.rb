(length, tests) = gets.split(" ").map{ |i| i.to_i }
lanes = gets.split(" ").map{ |i| i.to_i }

tests.times do
  arr = gets.split(" ").map{ |i| i.to_i }
  puts lanes.slice(arr[0], arr[1] - arr[0] + 1).min
end