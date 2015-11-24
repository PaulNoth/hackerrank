def remainders(number)
  fives = number
  threes = number - fives
  result = Array.new(2)
  while fives >= 0 && threes <= number do
    result[0] = fives
    result[1] = threes
    return result if(fives % 3 == 0 && threes % 5 == 0)
    threes += 5
    fives -= 5 
  end
  result[0] = -1
  result[1] = -1
  return result
end

test_cases = gets.chomp.to_i
test_cases.times do 
  number = gets.chomp.to_i
  (fives, threes) = remainders(number)
  if fives == -1
    puts "-1"
  else
    result = ""
    fives.times { result += "5" }
    threes.times { result += "3" }
    puts result
  end
end