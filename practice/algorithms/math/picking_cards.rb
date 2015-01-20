# Picking Cards
#
# There are N cards on the table and each has a number between 0 and N. 
# Let us denote the number on the ith card by ci. You want to pick up all the cards. 
# The ith card can be picked up only if at least ci cards have been picked up before it. 
# (As an example, if a card has a value of 3 on it, you can't pick that card up 
# unless you've already picked up 3 cards previously) In how many ways can all the cards be picked up?
# 
# Input Format 
# The first line contains the number of test cases T. T test cases follow. 
# Each case contains an integer N on the first line, followed by integers c1,..ci,...,cN on the second line.
# 
# Output Format 
# Output T lines one corresponding to each test case containing the required answer for the corresponding test case. 
# As the answers can be very big, output them modulo 1000000007.
# 
# Constraints: 
# 1 <= T <= 10 
# 1 <= N <= 50000 
# 0 <= ci <= N
# 
# Sample Input:
# 3  
# 3  
# 0 0 0  
# 3  
# 0 0 1  
# 3  
# 0 3 3
# Sample Output:
# 6  
# 4  
# 0
# Sample Explanations:
# For the first case, the cards can be picked in any order, so there are 3! = 6 ways. 
# For the second case, the cards can be picked in 4 ways: {1,2,3}, {2,1,3}, {1,3,2}, {2,3,1}.  
# For the third case, no cards can be picked up after the first one, so there are 0 ways to pick up all cards.
# 
# SOLUTION
# - usporiadam pole zostupne
# - pre kaz. prvok pola spravim N - prvok => rozdiel mi vravi o tom, ze tolko je ciastkovych moznosti ako vybrat ten prvok
#   hladam taky pocet prvkov, ktorych hodnota je mensia, ako aktualny index pola. len indem odkonca, nie od zaciatku.
#   (napr. ak by som mal 3-prvkove pole 2,0,1, tak najprv by som dostal 3-2 = 1, postupne by bolo 1*1*1, cize existuje len jedna kombinacia, ako vybrat karty)
# - rozdiel vynasobim s priebeznym vysledkom
#

test_cases = gets.chomp.to_i
test_cases.times do
  array_length = gets.chomp.to_i
  array  = gets.chomp.split.map { |e| e.to_i }
  
  array.sort! { |i,j| j <=> i }
  
  result = 1
  array.each do |element|
    diff = array_length - element
    diff = 0 if diff < 0
    result *= diff
    result %= 1000000007
    array_length -= 1
  end
  puts result
end
