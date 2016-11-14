n = gets.to_i
    
total_liked = 0
day_start_people = 5
for i in 0...n do
  day_liked = day_start_people / 2
  received = day_liked * 3
  total_liked = total_liked + day_liked
  day_start_people = received
end

puts total_liked