lines = gets.chomp.to_i
all_words = []
lines.times do
  words = gets.chomp.split.map { |s| s.to_s }
  words.each { |w| all_words << w}
end

tests = gets.chomp.to_i
tests.times do
  us_word = gets.chomp.to_s
  uk_word = us_word.sub("ze", "se")
  count = 0
  all_words.each do |word|
    count += 1 if word == us_word || word == uk_word
  end
  puts count
end

