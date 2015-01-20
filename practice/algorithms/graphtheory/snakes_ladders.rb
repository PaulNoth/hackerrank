# Snakes and Ladders: The Quickest Way Up
# ---------------------------------------------
# Markov takes out his Snakes and Ladders game and stares at the board, 
# and wonders: If he had absolute control on the die, 
# and could get it to generate any number (in the range 1-6) he desired, 
# what would be the least number of rolls of the die in which he’d be able to 
# reach the destination square (Square Number 100) after having
# started at the base square (Square Number 1)?
#
# Rules
# Markov has total control over the die and the face which shows up every time he tosses it.
# You need to help him figure out the minimum number of moves in which 
# he can reach the target square (100) after starting at the base (Square 1).
# 
# A die roll which would cause the player to land up at a square greater than 100, 
# goes wasted, and the player remains at his original square.
# Such as a case when the player is at Square Number 99, rolls the die, and ends up with a 5.
#
# If a person reaches a square which is the base of a ladder, 
# (s)he has to climb up that ladder, and he cannot come down on it. 
# If a person reaches a square which has the mouth of the snake, 
# (s)he has to go down the snake and come out through the tail - 
# there is no way to climb down a ladder or to go up through a snake.
# 
# Input Format
#  
# The first line contains the number of tests, T. T testcases follow.
# 
# For each testcase, there are 3 lines.
# 
# The first line contains the number of ladders and snakes, separated by a comma.
# The second is a list of comma separated pairs indicating the starting and ending squares of the ladders. The first point is the square from which a player can ascend and the second point is his final position. 
# The third is a list of comma separated pairs indicating the starting and ending (mouth and tail) squares of the snakes. the first point is the position of the mouth of the snake and the second one is the tail.
# Multiple comma separated pairs of snakes and ladders are separated by a single space.
#
# Constraints
# The board is always of the size 10 x 10
# 1 <= T <= 10
# 1 <= Number of Snakes <= 15
# 1 <= Number of Ladders <= 15
# Squares are always numbered 1 to 100 and the order can be seen in the image above.
# 
# Output Format
#
# For each of the T test cases, output one integer, each of a new line, 
# which is the least number of moves (or rolls of the die) 
# in which the player can reach the target square (Square Number 100) 
# after starting at the base (Square Number 1). 
# This corresponds to the ideal sequence of faces which show up when the die is rolled.
# 
# Sample Input
#
# 3
# 3,7
# 32,62 42,68 12,98
# 95,13 97,25 93,37 79,27 75,19 49,47 67,17
# 5,8
# 32,62 44,66 22,58 34,60 2,90
# 85,7 63,31 87,13 75,11 89,33 57,5 71,15 55,25
# 4,9
# 8,52 6,80 26,42 2,72
# 51,19 39,11 37,29 81,3 59,5 79,23 53,7 43,33 77,21
# Sample Output
# 
# 3
# 3
# 5
# Explanation
# 
# For the first test: To traverse the board via the shortest route, 
# the player first rolls the die to get a 5, and ends up at square 6. 
# He then rolls the die to get 6. He ends up at square 12, 
# from where he climbs the ladder to square 98. 
# He then rolls the die to get ‘2’, and ends up at square 100, 
# which is the target square. So, the player required 3 
# rolls of the die for this shortest and best case scenario. 
# So the answer for the first test is 3.
# 
# For the second test: Rolls the die to get 1, reaches square 2. 
# Then, climbs the ladder to square 90. 
# Rolls the die to get 4, reaches square 94. Rolls the die to get 6, 
# reaches square 100, which is the target square. 
# So the answer for the second test is also 3.
#
# Other input
# 3
# 1,4
# 22,54
# 79,17 67,7 89,25 69,23
# 14,11
# 28,64 24,98 14,76 4,56 54,92 18,90 20,68 46,84 8,80 48,88 44,60 26,96 52,66 34,72
# 61,43 87,3 95,33 69,27 71,19 57,47 81,39 73,5 89,45 97,13 99,37
# 5,7
# 42,96 44,84 8,74 12,70 18,78
# 61,11 99,15 91,43 75,45 93,33 67,9 59,51
#
# Output
# 12
# 5
# 7
#
#
#
# Riesenie:
# - Prechadzam policko po policku, ci sa nenachadza rebrik.
# - Ak ano vytvorim novy objekt, ktory bude obsahovat dosiahnutu poziciu a pocet hodeni kocky
# a pridam ho do frontu tahov
# inak sa posuniem vzdy o 6 a tento posun vlozim do frontu
# (tak prechadzam strom rieseni s co navacsimi posunmi)
# - robim tak dovtedy, kym nedosiahnem poziciu 100 a viac
# - potom vyberiem ten podstrom, ktorym som dosiahol najmenej hodov

class Move
  attr_reader :rolls, :position
  
  def initialize(position, rolls)
    @position = position
    @rolls = rolls
  end
end

test_cases = gets.chomp.to_i
test_cases.times do 
  # spracuje input
  (ladders_count, snakes_count) = gets.chomp.split(",").map { |e| e.to_i }
  ladders = gets.chomp.split
  snakes = gets.chomp.split
  ladders_hash = Hash.new
  snakes_hash = Hash.new
  ladders.each do |ladder|
    (start_p, end_p) = ladder.split(",").map { |e| e.to_i }
    ladders_hash[start_p] = end_p
  end
  
  snakes.each do |snake|
    (start_p, end_p) = snake.split(",").map { |e| e.to_i }
    snakes_hash[start_p] = end_p
  end
  
  
  
  start = Move.new(1, 0)
  moves = []
  moves.push(start) # inicializujem 1. tah
  rolls_at_hundred = [] # zodpoveda poctu hodov kocky jedneho podstromu pri dosiahnuti policka 100
  while !moves.empty? do
    move = moves.shift
   # puts "Move poisition: #{move.position}, rolls: #{move.rolls}"
    actual_position = move.position
    actual_rolls = move.rolls
    
    if actual_position >= 100
      rolls_at_hundred << actual_rolls
      next 
    end
    
    for i in 1..5
      pos = ladders_hash[actual_position + i]
      if !pos.nil?
        new_move = Move.new(pos, actual_rolls + 1)
        moves.push(new_move)
      end
    end
    
    pos = ladders_hash[actual_position + 6]
    if pos.nil?
      without_ladder = Move.new(actual_position + 6, actual_rolls + 1)
      moves.push(without_ladder)
    else
      new_move = Move.new(pos, actual_rolls + 1)
      moves.push(new_move)
    end
  end
  # usporiadam tahy a vyberiem najmensi
  rolls_at_hundred.sort! { |k, l| k <=> l}
  puts rolls_at_hundred[0]
end