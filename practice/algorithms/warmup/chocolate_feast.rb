# Little Bob loves chocolates, and goes to the store with $N money in his pocket. The price of each chocolate is $C. The store offers a discount: for every M wrappers he gives the store, he’ll get one chocolate for free. How many chocolates does Bob get to eat?
# 
# Input Format:
# The first line contains the number of test cases T (<=1000). 
# T lines follow, each of which contains three integers N, C and M
#
# Output Format:
# Print the total number of chocolates Bob eats.
#
# Constraints:
# 2 <= N <= 100000
# 1 <= C <= N
# 2 <= M <= N
#
# Sample input
#
# 3
# 10 2 5
# 12 4 4
# 6 2 2
# Sample Output
#
# 6
# 3
# 5

test_cases = t = gets.to_i
test_cases.times {
  (n, c, m) = gets.split.map{|i| i.to_i}
      
       answer = 0
       chocolate = n / c
       answer += chocolate
       
       free_choco = chocolate / m
      
       
       while free_choco > 0 do
          answer += free_choco
         wrappers = free_choco * m
         chocolate -= wrappers
         chocolate += free_choco
         free_choco = chocolate / m
       end
       
       puts answer
   }