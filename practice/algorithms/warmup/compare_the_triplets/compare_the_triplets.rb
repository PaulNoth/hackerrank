a0, a1, a2 = gets.strip.split(' ')
a0 = a0.to_i
a1 = a1.to_i
a2 = a2.to_i
b0, b1, b2 = gets.strip.split(' ')
b0 = b0.to_i
b1 = b1.to_i
b2 = b2.to_i

alice_score = 0
bob_score = 0

alice_score = alice_score + 1 if a0 > b0
alice_score = alice_score + 1 if a1 > b1
alice_score = alice_score + 1 if a2 > b2

bob_score = bob_score + 1 if a0 < b0
bob_score = bob_score + 1 if a1 < b1
bob_score = bob_score + 1 if a2 < b2

puts "#{alice_score} #{bob_score}"