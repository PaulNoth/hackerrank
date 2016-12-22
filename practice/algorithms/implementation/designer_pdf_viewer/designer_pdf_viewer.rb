heights = gets.strip.split.map(&:to_i)
word = gets.strip
charHeights = word.chars.map{|c| heights[c.ord - 97]}
max = charHeights.max
square = word.size * max

puts square