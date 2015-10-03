test_cases = gets.chomp.to_i
test_cases.times do 
  length = gets.chomp.to_i
  string = gets.chomp
  letters = string.split("")
  #puts letters
  for i in 0..letters.length do
    for j in i+1..letters.length-1 do
      puts "#{letters[i] + letters[j]}"
    end
  end
end