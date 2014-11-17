# The Love-Letter Mystery
# 
# James got hold of a love letter that his friend Harry has written for his girlfriend. 
# Being the prankster that James is, he decides to meddle with it. 
# He changes all the words in the letter into palindromes. 
# For any given string, he can only decrease the value of any one of the letters, for example, ‘d’ will become ‘c’, etc. 
# This will count as one operation. (Also, he can decrease the value of letters only till he reaches ‘a’. ‘a’ cannot be further reduced to ‘z’) 
# Find the minimum number of operations he needs to carry out to convert a given string into a palindrome. 
# 
# Input Format
#  The first line contains an integer T i.e. number of test cases.
#  The next T lines will contain a string each. 
# 
# Output Format
#  A single line containing number of minimum operations corresponding to each test case.
# 
# Constraints
#  1 ≤ T ≤ 10
#  1 ≤ length of string ≤ 104 
# 
# Sample Input #00 
# 3
# abc
# abcba
# abcd
# 
# Sample Output #00 
# 2
# 0
# 4

tests = gets.chomp.to_i
tests.times do
  input = gets.chomp
  changes = 0
  for i in 0...input.length / 2
    char_front = input[i]
    char_back = input[input.length - 1 - i]
    diff = (char_front.ord - char_back.ord).abs
    changes += diff
  end
  puts changes
end