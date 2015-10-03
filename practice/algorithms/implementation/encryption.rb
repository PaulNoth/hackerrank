input = gets.chomp
width = Math.sqrt(input.length).floor
height = Math.sqrt(input.length).ceil
result = ""
for i in 0...height do
  j = i
  while j < input.length
    result += input[j]
    j += height
  end
  result += " "
end
puts result
