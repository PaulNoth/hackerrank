# Given two integers: L and R,
# find the maximal values of A xor B ∀ L ≤ A ≤ B ≤ R
# 
# Input Format
# The input contains two lines, L is present in the first line. 
# R in the second line.
# 
# Constraints
# 1 ≤ L ≤ R ≤ 103
# 
# Output Format
# The maximal value as mentioned in the problem statement.
# 
# Sample Input
# 1
# 10
# 
# Sample Output
# 15
# 
# Explanation
# The maximum value can be obtained for A = 5 and B = 10,
# 
# 1010 xor 0101 = 1111 hence 15.


def maxXor(l, r)
  max = 0
  for i in l..r do
    for j in l..r do
      xor = i ^ j
      max = xor if xor > max
    end
  end
  return max
end


l = gets.to_i
r = gets.to_i
print maxXor(l, r)