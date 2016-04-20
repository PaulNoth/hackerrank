n = gets.to_i
sticks = gets.split.map(&:to_i)
while(sticks.size > 0) do
  puts sticks.size
  sticks.sort!{|a, b| a <=> b}
  min = sticks[0]
  sticks = sticks.filter {|i| i > min}
end