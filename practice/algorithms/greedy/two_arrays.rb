# You are given two integer arrays, A and B, each containing N integers. 
# The size of the array is less than or equal to 1000. 
# You are free to permute the order of the elements in the arrays.
#
# Now here’s the real question - is there an arrangement of the arrays, such that, 
# Ai+Bi ≥ K for all i, where Ai denotes the ith element in the array A.
#
#
# Input Format
# The first line contains an integer, T, the number of test-cases. 
# T test cases follow. Each test case has the following format:
#
# The first line contains two integers, N and K. The second line contains N space separated integers, denoting A array. The third line describes B array in a same format.
#
# Output Format
# For each test case, if such an arrangement exists output “YES”, otherwise “NO” (without quotes).
#
# Constraints
# 1 <= T <= 10
# 1 <= N <= 1000
# 1 <= K <= 109
# 0 <= Ai, Bi ≤ 109
#
# Sample Input
#
# 2
# 3 10
# 2 1 3
# 7 8 9
# 4 5
# 1 2 2 1
# 3 3 3 4
#
# Sample Output
#
# YES
# NO

def prove(arr1, arr2, sum)
  for i in 0..arr1.length - 1 do
    return "NO" if arr1[i] + arr2[i] < sum
  end
  return "YES"
end

test_cases = gets.chomp.to_i
test_cases.times do
  (arr_length, sum) = gets.chomp.split.map { |e| e.to_i}
  arr1 = gets.chomp.split.map { |e| e.to_i}
  arr2 = gets.chomp.split.map { |e| e.to_i}
  arr1.sort! {|i, j| i <=> j}
  arr2.sort! { |i, j| j <=> i}
  puts prove(arr1, arr2, sum)
end