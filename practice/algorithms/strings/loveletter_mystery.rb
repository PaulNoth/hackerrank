tests = gets.chomp.to_i
tests.times do
  input = gets.chomp
  changes = 0
  for i in 0...input.length / 2
    char_front = input[i]
    char_back = input[input.length - 1 - i]
    diff = (char_front.ord - char_back.ord).abs
    changes += diff
  end
  puts changes
end