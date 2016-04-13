def before_class(arrivals)
  result = 0
  arrivals.each do |item|
    result += 1 if item <= 0
  end
  return result
end

tests = gets.to_i
tests.times do |i|
  (students, cancelation) = gets.split(" ").map {|i| i.to_i}
  arrivals = gets.split(" ").map {|i| i.to_i}
  before = before_class(arrivals)
  if(cancelation > before)
    puts "YES"
  else
    puts "NO"
  end
end