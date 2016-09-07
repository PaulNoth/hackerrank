def saved_prisoner(line)
  numbers = line.split(" ").map {|i| i.to_i}
  prisoners = numbers[0]
  sweets = numbers[1]
  startId = numbers[2]

  saved = (((sweets % prisoners) + startId) % prisoners) - 1;
  return prisoners if (saved == 0)
  saved
end

n = gets.to_i
n.times do
  puts saved_prisoner(gets)
end