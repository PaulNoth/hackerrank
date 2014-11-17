# Flowers
#
# You and your K-1 friends want to buy N flowers. Flower number i has cost ci. 
# Unfortunately the seller does not want a customer to buy a lot of flowers, 
# so he tries to change the price of flowers for customers who have already bought flowers before.
# More precisely, if a customer has already bought x flowers, 
# he should pay (x+1)*ci dollars to buy flower number i. 
# You and your K-1 friends want to buy all N flowers in such a way that you spend the least amount of money. 
# You can buy the flowers in any order.
#
# Input:
# The first line of input contains two integers N and K (K <= N). 
# The next line contains N space separated positive integers c1,c2,...,cN.
#
# Output:
# Print the minimum amount of money you (and your friends) have to pay in order to buy all N flowers.
#
# Sample input :
# 3 3 
# 2 5 6
# 
# Sample output :
# 13
# 
# Explanation : 
# In this example, all of you should buy one flower each. Hence, you'll have to pay 13 dollars.
# 
# Constraint :
# 1 <= N, K  <= 100 
# Any ci is not more than 1,000,000
#
# 50 3
# 390225 426456 688267 800389 990107 439248 240638 15991 874479 568754 729927 980985 132244 488186 5037 721765 251885 28458 23710 281490 30935 897665 768945 337228 533277 959855 927447 941485 24242 684459 312855 716170 512600 608266 779912 950103 211756 665028 642996 262173 789020 932421 390745 433434 350262 463568 668809 305781 815771 550800

(n, k) = gets.chomp.split.map { |e| e.to_i }
prices = gets.chomp.split.map { |e| e.to_i }

prices.sort! { |i,j| j <=> i }
result = 0
n.times do |i|
  factor = i / k
  result += (factor + 1) * prices[i]
end
puts result
