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