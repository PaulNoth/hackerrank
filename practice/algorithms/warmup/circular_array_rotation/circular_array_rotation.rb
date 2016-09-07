(n, k, q) = gets.split(" ").map(&:to_i)
elements = gets.split(" ").map(&:to_i)
queries = []
q.times do
  queries << gets.to_i
end

rotationPos = k % n
part1 = elements.slice(0, n - rotationPos)
part2 = elements.slice(n - rotationPos, n)
final_array = part2.concat(part1)

q.times do |i|
  puts final_array[queries[i]]
end