s = gets.strip
n = gets.strip.to_i

as = s.count("a")
times = n / s.size
rest = n % s.size

totalAs = times * as + s.slice(0, rest).count("a")
puts totalAs