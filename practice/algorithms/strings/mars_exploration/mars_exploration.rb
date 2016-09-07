msg = gets.to_s.strip
index = 0
result = 0
while index < msg.length do
  result += 1 if msg[index] != 'S'
  result += 1 if msg[index + 1] != 'O'
  result += 1 if msg[index + 2] != 'S'
  index += 3
end

puts result