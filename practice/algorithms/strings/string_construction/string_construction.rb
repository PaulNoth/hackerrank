def cost(s)
  map = Hash.new
  for i in 0...(s.size)
    map[s[i]] = true
  end
  map.size
end

n = gets.to_i
n.times do
  s = gets.to_s.strip
  puts cost(s)
end