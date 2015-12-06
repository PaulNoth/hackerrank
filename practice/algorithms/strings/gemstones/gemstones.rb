string_count = gets.to_i
first = gets.chars.uniq
(string_count - 1).times do
  s = gets.chars.uniq
  first = first & s
end
puts first.length