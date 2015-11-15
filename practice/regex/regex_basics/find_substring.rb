lines_count = gets.chomp.to_i
words = []
lines_count.times do
  line = gets.chomp
  w = line.split
  w.each { |a| words << a}
end

pattern_count = gets.chomp.to_i
pattern_count.times do
  input = gets.chomp
  pattern = "[a-z_]+#{input}[a-z_]+"
  result = 0
  words.each do |word|
    if word =~ /\w+#{input}\w+/
      result += 1 
    end
  end
  puts result
end
