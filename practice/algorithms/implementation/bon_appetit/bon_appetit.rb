(n, k) = gets.strip.split.map(&:to_i)
items = gets.strip.split.map(&:to_i)
actual = gets.strip.to_i

sum = 0
items.each{ |i| sum += i}
charged = (sum - items[k]) / 2

if(charged == actual)
  puts "Bon Appetit"
else
  puts (actual - charged)
end