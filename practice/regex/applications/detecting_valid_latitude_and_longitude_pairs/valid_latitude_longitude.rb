gets.chomp.to_i.times do
  input = gets.chomp.to_s
  if input =~
      /^\([+-]?((90(\.0+)?)|([1-8][0-9](\.[0-9]+)?)|([0-9](\.[0-9]+)?)),\s*[+-]?(((([1-9][0-9])|([0-9]))(\.[0-9]+)?)|(1((80(\.0+)?)|([0-7][0-9](\.[0-9]+)?))))\)$/
    puts "Valid"
  else
    puts "Invalid"
  end
end