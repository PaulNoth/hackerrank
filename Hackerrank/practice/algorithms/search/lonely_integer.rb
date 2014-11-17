# Lonely Integer
# 
# There are N integers in an array A. All but one integer occurs in pairs. 
# Your task is to find out the number that occurs only once.
# 
# Input Format
# The first line of the input contains an integer N indicating number of integers in the array A.
# The next line contains N integers each separated by a single space.
# 
# Constraints
# 1 <= N < 100
# N % 2 = 1 ( N is an odd number )
# 0 <= A[i] <= 100, ∀ i ∈ [1, N]
# 
# Output Format
# Output S, the number that occurs only once.
# 
# Sample Input:1
# 1
# 1
# Sample Output:1
# 1
# Sample Input:2
# 3
# 1 1 2
# Sample Output:2
# 2
# Sample Input:3
# 5
# 0 0 1 2 1
# Sample Output:3
# 
# 2

length = gets.chomp.to_i
array = gets.chomp.split.map { |e| e.to_i }
hash = Hash.new
array.each do |i|
  if hash[i].nil?
    hash[i] = 1
  else
    hash[i] += 1
  end
end

array.each { |a| puts a if hash[a] == 1}
