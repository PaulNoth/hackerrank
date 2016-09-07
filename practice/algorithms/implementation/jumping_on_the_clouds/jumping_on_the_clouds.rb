n = gets.to_i
clouds = gets.split(" ").map{|i| i.to_i}

steps = 0
index = 0
while (index < clouds.length - 1) do
    if((index + 2 < clouds.length) && clouds[index + 2] != 1)
      index = index + 2
    else
      index = index + 1
    end
    steps += 1
end

puts steps