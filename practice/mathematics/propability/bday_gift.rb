# B'day Gift
#
# Isaac has to buy a new HackerPhone for his girlfriend Amy. 
# He is exploring the shops in the town to compare the prices whereupon 
# he finds a shop located on the first floor of a building, that has a unique pricing policy. 
# There are N steps leading to the shop. A numbered ball is placed on each of the steps. 
# The shopkeeper gives Isaac a fair coin and asks him to toss the coin before climbing each step. 
# If the result of the toss is a 'Heads', Isaac should pick up the ball, 
# else leave it and proceed to the next step.
# 
# The shopkeeper then asks Isaac to find the sum of all the numbers 
# he has picked up (let's say S). The price of the HackerPhone is 
# then the expected value of S. Help Isaac find the price of the HackerPhone.
# 
# Input Format 
# The first line of the input contains an integer N, the number of steps. N lines follow, 
# which are the numbers written on the ball on each step.
# 
# Output Format 
# A single line containing expected value.
# 
# Note : Expected value must be printed as a decimal number having exactly one digit after decimal. 
# It is guaranteed that the correct answer will have at most one digit after decimal.
# 
# Constraints 
# 1 <= N <= 40 
# 1 <= number on any ball <=109
# 
# Sample Input #00:
# 3
# 1 
# 1
# 2
# Sample Output #00:
# 2.0
# Sample Input #01:
# 4
# 1 
# 2
# 2
# 2
# Sample Output #01:
# 3.5
# Explanation 
# In the first case there can be 8 different ways depending on the ball choice. 
# So, we can multiply sum for each way by its probability to occur i.e. 1/8 and sum up to get the expected value as 2. 
# Similarly in the second case we have 4 items , there can be 16 ways and following the expected value one gets is 3.5.

balls = gets.chomp.to_i
expected_num = 0
balls.times do
  input = gets.chomp.to_i
  expected_num += input
end
expected_num /= 2.0
puts "#{format('%.1f', expected_num)}"
