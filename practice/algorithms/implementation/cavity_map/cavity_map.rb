def is_cavity(map, i, j)
  depth = map[i][j].to_i
  return false if (depth <= map[i - 1][j].to_i)
  return false if (depth <= map[i][j - 1].to_i)
  return false if (depth <= map[i + 1][j].to_i)
  return false if (depth <= map[i][j + 1].to_i)
  return true;
end

n = gets.to_i
map = []
n.times do
  map << gets
end

new_map = []
map.each do |m|
  new_map << m.reverse.reverse!
end

for i in 1...(n - 1) do
  for j in 1...(n - 1) do
    new_map[i][j] = 'X' if is_cavity(map, i, j)
  end
end

new_map.each do |m|
  puts m
end