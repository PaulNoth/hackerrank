(n, k) = gets.split(" ").map(&:to_i)
clouds = gets.split(" ").map(&:to_i)

energy = 100
pos = k % n
energy -= ((clouds[pos] == 1) ? 3 : 1)
while(pos != 0) do
  pos = (pos + k) % n
  energy -= ((clouds[pos] == 1) ? 3 : 1)
end
puts energy