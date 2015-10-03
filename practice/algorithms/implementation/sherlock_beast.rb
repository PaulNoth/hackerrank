# rozdelim cislo n na 2 casti tak, aby jedna cast bola delitelna 3 a druha 5
# vratim pole:
# index 0 je pocet 5 iek
# index 1 je pocet 3 jok
# preto su patky prve lebo to musi byt najvacsie cislo obsahujuce n cifier a ked su 5 vpredu, urcite bude najvacsie
# inak vratim -1 a -1, ze neexistuje take rozdelenie 
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