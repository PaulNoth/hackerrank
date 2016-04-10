(n, k) = gets.split.map {|i| i.to_i}
problems_per_chapter = gets.split.map {|i| i.to_i}
page = 1
special_problems = 0
n.times do |i|
  problems = problems_per_chapter[i]
  for p in 1..problems
    special_problems += 1 if p == page
    page += 1 if p != problems && p % k == 0
  end
  page += 1
end

puts special_problems