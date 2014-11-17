# Ice Cream Parlor
#
# Sunny and Johnny together have M dollars which they intend to use at the ice cream parlour. 
# Among N flavors available, they have to choose two distinct flavors whose cost equals M. 
# Given a list of cost of N flavors, output the indices of two items whose sum equals M. 
# The cost of a flavor (ci) will be no more than 10000.
#
# Input Format
# The first line of the input contains T, T test cases follow. 
# Each test case follows the format: The first line contains M. 
# The second line contains the number N. 
# The third line contains N single space separated integers denoting the price of each flavor ci.
# 
# Output Format
# Output two integers, each of which is a valid index of the flavor. 
# The lower index must be printed first. Indices are indexed from 1 to N.
# 
# Constraints
# 1 ≤ T ≤ 50 
# 2 ≤ M ≤ 10000 
# 2 ≤ N ≤ 10000 
# 1 ≤ ci ≤ 10000 
# The prices of two items may be same and each test case has a unique solution.
#
# Sample Input
# 2
# 4
# 5
# 1 4 5 3 2
# 4
# 4
# 2 2 4 3
# Sample Output
# 1 4
# 1 2
# Explanation
# 
# The sample input has two test cases. For the 1st, the amount M = 4 and there are 5 flavors at the store. 
# The flavors indexed at 1 and 4 sums to 4. For the 2nd test case, the amount M = 4 and the flavors indexed at 1 and 2 sums to 4.
  
tests = gets.chomp.to_i
tests.times do
  m = gets.chomp.to_i
  n = gets.chomp.to_i
  flavors = gets.chomp.split.map { |e| e.to_i }
  for i in 0...flavors.length - 1 do
    for j in i + 1...flavors.length do
      puts "#{i + 1} #{j + 1}" if flavors[i] + flavors[j] == m
    end
  end
end