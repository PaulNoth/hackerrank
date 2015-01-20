## Alex is attending a Halloween party with his girlfriend Silvia. At the party, Silvia spots a giant chocolate bar. If the chocolate can be served as only 1 x 1 sized pieces and Alex can cut the chocolate bar exactly K times, what is the maximum number of chocolate pieces Alex can cut and give Silvia?
##
## Input Format
## The first line contains an integer T, the number of test cases. T lines follow.
## Each line contains an integer K
##
## Output Format
## T lines. Each containing the output corresponding to the test case.
##
## Constraints
## 1<=T<=10
## 2<=K<=107
##
## Note
## Chocolate needed to be served in size of 1 x 1 size pieces.
## Alex can’t relocate any of the pieces. Neither he can place any piece on top of other.
##
## Sample Input #00
##
## 4
## 5
## 6
## 7
## 8
## Sample Output #00
##
## 6
## 9
## 12
## 16
##

test_cases = gets.chomp.to_i
test_cases.times do |test|
  slices = gets.chomp.to_i
  horizontal_slices = slices / 2
  vertical_slices = slices - horizontal_slices
  puts vertical_slices * horizontal_slices
end
