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