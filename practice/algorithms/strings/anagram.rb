# Anagram
#
# Sid is obsessed about reading short stories. Being a CS student, 
# he is doing some interesting frequency analysis with the books. 
# From two short story books, he choses strings having length a 
# from the first and strings having length b from the second one. 
# The strings are such that the difference of length is <= 1
# 
# i.e. 
# |a-b|<=1, where |x| represents the absolute value function.
# 
# He believes that both the strings should be anagrams based on his experiment. 
# Your challenge is to help him find the minimum number of characters of the first 
# string he needs to change to make it an anagram of the second string. 
# Neither can he add a character nor delete a character from the first string. 
# Only replacement of the characters with new ones is allowed.
# 
# Input Format
# 
# First line will contain an integer T representing the number of test cases. 
# Each test case will contain a string having length (a+b) 
# which will be concatenation of both the strings described in problem. 
# The string will only contain small letters and without any spaces.
# 
# Output Format
# 
# An integer corresponding to each test case is printed in a different line i.e., 
# the number of changes required for each test case. Print ‘-1’ if it is not possible.
# 
# Constraints
# 
# 1<=T<=100
#  length of input string i.e. 1<=a+b<=10000 
# 
# Sample Input
# 5
# aaabbb
# ab
# abc
# mnop
# xyyx
# 
# Sample Output
# 3
# 1
# -1
# 2
# 0 
# 
# Explanation
# 
# In fifth test case, first string will be "xy"
# while second string will be "yx" . so a = 2 and b = 2, 
# where a and b are length of strings. As we can see that a and b are following relation 
# |a-b|<=1
# 
# and both strings are anagrams.So number of changes required = 0.
#
# 10
# hhpddlnnsjfoyxpciioigvjqzfbpllssuj
# xulkowreuowzxgnhmiqekxhzistdocbnyozmnqthhpievvlj
# dnqaurlplofnrtmh
# aujteqimwfkjoqodgqaxbrkrwykpmuimqtgulojjwtukjiqrasqejbvfbixnchzsahpnyayutsgecwvcqngzoehrmeeqlgknnb
# lbafwuoawkxydlfcbjjtxpzpchzrvbtievqbpedlqbktorypcjkzzkodrpvosqzxmpad
# drngbjuuhmwqwxrinxccsqxkpwygwcdbtriwaesjsobrntzaqbe
# ubulzt
# vxxzsqjqsnibgydzlyynqcrayvwjurfsqfrivayopgrxewwruvemzy
# xtnipeqhxvafqaggqoanvwkmthtfirwhmjrbphlmeluvoa
# gqdvlchavotcykafyjzbbgmnlajiqlnwctrnvznspiwquxxsiwuldizqkkaawpyyisnftdzklwagv
# 
# 10
# 13
# 5
# 26
# 15
# -1
# 3
# 13
# 13
# -1


# - rozdelim na 2 polky
# - skumam po znakoch z prvej polky, ci sa nenachadza v druhej polke
# - ak ano, vymazem ten znak z druhej polky
# => tieto znaky netreba vymienat, tie tam su
# - zvysok, co zostane v druhej casti je vysledok, lebo tolko znakov potrebujem vymenit,
# aby bol anagram
def substitutions(input)
  half1 = input.slice(0, input.length / 2)
  half2 = input.slice(input.length / 2, input.length)
  
  for i in 0..half1.length - 1 do
    half2.sub!(half1[i], "") if half2.include?(half1[i])
  end
  return half2.length
end

tests = gets.chomp.to_i
tests.times do
  input = gets.chomp
  result = 0
  if input.length % 2 != 0
    result = -1
  else
    result = substitutions(input)
  end
  
  puts result
end