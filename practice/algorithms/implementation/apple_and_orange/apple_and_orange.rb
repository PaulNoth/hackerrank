s,t = gets.strip.split(' ')
s = s.to_i
t = t.to_i
a,b = gets.strip.split(' ')
a = a.to_i
b = b.to_i
m,n = gets.strip.split(' ')
m = m.to_i
n = n.to_i
apple = gets.strip
apple = apple.split(' ').map(&:to_i)
orange = gets.strip
orange = orange.split(' ').map(&:to_i)

fallen_apples = apple.select {|ap| (a + ap >= s) && (a + ap <= t)}.count
fallen_oranges = orange.select {|o| (b + o >= s) && (b + o <= t)}.count

puts fallen_apples
puts fallen_oranges