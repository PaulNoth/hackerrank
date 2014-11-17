# Sherlock Holmes is getting paranoid about Professor Moriarty, his archenemy. 
# All his efforts to subdue Moriarty have been in vain. 
# These days Sherlock is working on a problem with Dr. Watson. 
# Watson mentioned that the CIA has been facing weird problems with their supercomputer, 
# ‘The Beast’, recently.
#
# This afternoon, Sherlock received a note from Moriarty, saying that he has infected ‘The Beast’ with a virus. 
# Moreover, the note had the number N printed on it. After doing some calculations, 
# Sherlock figured out that the key to remove the virus is the largest ‘Decent’ Number having N digits.
#
# A ‘Decent’ Number has -
# 1. Only 3 and 5 as its digits.
# 2. Number of times 3 appears is divisible by 5.
# 3. Number of times 5 appears is divisible by 3.
# 
# Meanwhile, the counter to destruction of ‘The Beast’ is running very fast. 
# Can you save ‘The Beast’, and find the key before Sherlock?
#
# Input Format
# The 1st line will contain an integer T, the number of test cases, followed by T lines, 
# each line containing an integer N i.e. the number of digits in the number 
#
# Output Format
# Largest Decent number having N digits. If no such number exists, tell Sherlock that he is wrong and print ‘-1’ 
#
# Constraints
# 1<=T<=20
# 1<=N<=100000
# 
# 
# Sample Input
# 4
# 1
# 3
# 5
# 11
# Sample Output
# -1
# 555
# 33333
# 55555533333

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