def lcs_length_optimized(input1, input2)
  start = 0
  m_end = input1.length - 1
  n_end = input2.length - 1
  while start <= m_end && start <= n_end && input1[start] == input2[start]
    start += 1
  end
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