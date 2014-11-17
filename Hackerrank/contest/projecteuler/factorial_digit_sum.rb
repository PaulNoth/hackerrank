# Project Euler #20: Factorial digit sum
#
# n! means n×(n−1)×⋯×3×2×1
# For example, 10!=10×9×⋯×3×2×1=3628800, 
# and the sum of the digits in the number 10! is 3+6+2+8+8+0+0=27.
# 
# Find the sum of the digits in the number N!
# 
# Input Format 
# The first line contains an integer T , i.e., number of test cases. 
# Next T lines will contain an integer N.
#
# Output Format 
# Print the values corresponding to each test case.
#
# Constraints 
# 1<=T<=100 
# 0<=N<=1000

def factorial(n)
  fact = 1
  for i in 2..n do
    fact *= i
  end
  return fact
end


def sum_digits(number)
  chars = number.to_s.chars
  sum = 0
  chars.each { |char| sum += char.to_i }
  return sum
end
 
gets.chomp.to_i.times do
  n = gets.chomp.to_i
  puts sum_digits(factorial(n))
end
