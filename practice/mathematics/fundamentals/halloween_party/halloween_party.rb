test_cases = gets.chomp.to_i
test_cases.times do |test|
  slices = gets.chomp.to_i
  horizontal_slices = slices / 2
  vertical_slices = slices - horizontal_slices
  puts vertical_slices * horizontal_slices
end
