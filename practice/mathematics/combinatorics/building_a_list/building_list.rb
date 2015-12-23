def combine(result, input, start, actual)
  for i in start...input.length do
    out = actual
    actual += input[i]
    result << actual
    if i < input.length
      combine(result, input, i + 1, out);
    end
  end
end

test_cases = gets.chomp.to_i
test_cases.times do
  length = gets.strip.chomp.to_i
  input = gets.strip.chomp.to_s
  result = []
  combine(result, input, 0, '')
  result.sort! {|a, b| a <=> b}
  puts result.join("\n")
end