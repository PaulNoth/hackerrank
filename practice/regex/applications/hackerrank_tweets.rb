tests = gets.chomp.to_i
result = 0
tests.times do
  words = gets.chomp.split
  words.each do |word|
    result += 1 if word.downcase =~ /.*hackerrank.*/
  end
end

puts result