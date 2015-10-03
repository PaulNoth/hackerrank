gets.chomp.to_i.times do
  directors = gets.chomp.to_i
  result = 0
  (directors - 1).downto 0 do |handshakes|
    result += handshakes
  end
  puts result
end