def stair(spaces, hashes)
  " " * spaces + "#" * hashes
end

n = gets.to_i

for i in 1..n do
  puts stair(n - i, i)
end