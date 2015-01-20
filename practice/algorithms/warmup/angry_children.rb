# Bill Gates is on one of his philanthropic journeys to a village in Utopia. 
# He has N packets of candies and would like to distribute one packet to each of the K children in the village 
# (each packet may contain different number of candies). To avoid any fighting among the children, 
# he would like to pick K out of N packets, such that unfairness is minimized.
# 
# Suppose the K packets have (x1, x2, x3,….xk) candies in them, 
# where xi denotes the number of candies in the ith packet, then we define unfairness as
# 
# max(x1,x2,…xk) - min(x1,x2,…xk)
# 
# where max denotes the highest value amongst the elements, 
# and min denotes the least value amongst the elements. 
# Can you figure out the minimum unfairness and print it?
#
# Input Format
# The first line contains an integer N.
# The second line contains an integer K. 
# N lines follow. Each line contains an integer that denotes the candy in the ith packet.
#
# Output Format
# A single integer which will be the minimum unfairness.
#
# Constraints
# 1<=N<=10^5
# 1<=K<=N
# 0<= number of candies in any packet <=10^9
# 
# Sample Input #00
# 7
# 3
# 10
# 100
# 300
# 200
# 1000
# 20
# 30
# Sample Output #00
# 20

n = gets.to_i
k = gets.to_i
candy = Array.new(n)
for i in 0..n-1
      candy[i] = gets.to_i
end
candy.sort! {|l,j| l <=> j}
unfairness = candy[candy.length - 1]
for i in 0..candy.length - k do
  # pri usporiadanom poli je vzdy maximum najvyssi index (pod)pola a minimum najmensi index (pod)pola
  temp_unfairness = candy[i + k - 1] - candy[i]
  unfairness = temp_unfairness if unfairness > temp_unfairness  
end
puts unfairness

