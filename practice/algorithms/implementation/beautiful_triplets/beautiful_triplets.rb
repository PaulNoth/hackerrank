(n, d) = gets.strip.split(" ").map {|i| i.to_i}
array = gets.strip.split(" ").map {|i| i.to_i}

triplets = 0
for i in 0...(n-2)
  for j in (i+1)...(n-1)
    break if (array[j] - array[i] > d)
    for k in (j+1)...(n)
      break if (array[k] - array[j] > d)
      triplets += 1 if((array[k] - array[j] == d) && (array[j] - array[i] == d))
    end
  end
end

puts triplets