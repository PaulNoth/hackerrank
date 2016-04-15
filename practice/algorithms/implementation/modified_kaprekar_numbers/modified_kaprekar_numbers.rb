def is_kaprekar(num)
  square = (num ** 2).to_s
  if(square.size > 0)
    l = square.slice(0, (square.size / 2).to_i).to_i
    r = square.slice((square.size / 2).to_i, (square.size)).to_i
    return (l + r) == num
  else
    return square.to_i == num
  end
end

lower = gets.to_i
upper = gets.to_i
kaprekars = []
for i in lower..upper
  kaprekars << i if(is_kaprekar(i))
end

if(kaprekars.size > 0)
  puts kaprekars.join(" ")
else
  puts "INVALID RANGE"
end