n = gets.strip.to_i
binary = n.to_s(2)
zeroes = binary.count("0")
zeroes = 0 if n == 0
result = 2**zeroes

puts result