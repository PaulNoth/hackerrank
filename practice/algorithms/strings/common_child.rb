# SOLUTION:
# http://en.wikipedia.org/wiki/Longest_common_subsequence_problem
#
# function LCSLength(X[1..m], Y[1..n])
#    C = array(0..m, 0..n)
#    for i := 0..m
#       C[i,0] = 0
#    for j := 0..n
#       C[0,j] = 0
#    for i := 1..m
#        for j := 1..n
#            if X[i] = Y[j]
#                C[i,j] := C[i-1,j-1] + 1
#            else
#                C[i,j] := max(C[i,j-1], C[i-1,j])
#    return C[m,n]

# function LCS(X[1..m], Y[1..n])
#    start := 1
#    m_end := m
#    n_end := n
#   // trim off the matching items at the beginning
#    while start ≤ m_end and start ≤ n_end and X[start] = Y[start]
#        start := start + 1
#   // trim off the matching items at the end
#    while start ≤ m_end and start ≤ n_end and X[m_end] = Y[n_end]
#        m_end := m_end - 1
#        n_end := n_end - 1
#    C = array(start-1..m_end, start-1..n_end)
#    only loop over the items that have changed
#    for i := start..m_end
#        for j := start..n_end
#            the algorithm continues as before ...

# one test did not pass due to timeout, but the same algorithm passed in Java  
def lcs_length_optimized(input1, input2)
  start = 0
  m_end = input1.length - 1
  n_end = input2.length - 1
  # trim off the matching items at the beginning
  while start <= m_end && start <= n_end && input1[start] == input2[start]
    start += 1
  end
  # trim off the matching items at the end
  while start <= m_end && start <= n_end && input1[m_end] == input2[n_end]
    m_end -= 1
    n_end -= 1
  end
   
  table = Array.new(m_end - start + 1) { Array.new(n_end - start + 1,  (start - 0) + (input1.length - m_end - 1)) }
  
  for i in start...m_end do
    for j in start...n_end do
      if input1[i] == input2[j]
        table[i + 1][j + 1] = table[i][j] + 1
      else
        table[i + 1][j + 1] = [table[i + 1][j], table[i][j + 1]].max
      end
    end
  end
  return table[m_end][n_end]
end
       
def lcs_length(input1, input2)
  table = Array.new(input1.length + 1) { Array.new(input2.length + 1,  0) }
  
  input1.length.times do |i|
    input2.length.times do |j|
      if input1[i] == input2[j]
        table[i + 1][j + 1] = table[i][j] + 1
      else
        table[i + 1][j + 1] = [table[i + 1][j], table[i][j + 1]].max
      end
    end
  end
  return table[input1.length][input2.length]
end
    
input1 = gets.chomp
input2 = gets.chomp

puts lcs_length_optimized(input1, input2)