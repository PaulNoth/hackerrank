input_time = gets.to_s
hours = input_time.slice(0, 2).to_i
minutes = input_time.slice(input_time.index(":") + 1, 2).to_i
seconds = input_time.slice(input_time.index(":", input_time.index(":") + 1) + 1, 2).to_i

newHours = hours
if hours == 12 then
  newHours = 0 
end

shift = 0
if input_time.upcase.include? "PM" then
  shift = 12
end

puts "%02d:%02d:%02d" % [newHours + shift, minutes, seconds]
