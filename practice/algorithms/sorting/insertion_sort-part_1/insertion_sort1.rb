def print_array(arr)
  puts arr.join(" ")
end

def insertionSort(ar)
  num = ar[ar.size - 1]
  placed = false
  (ar.size - 2).downto(0) do |j|
    if(ar[j] > num)
      ar[j + 1] = ar[j]
      print_array(ar)
    else
      ar[j + 1] = num
      print_array(ar)
      placed = true
      break
    end
  end
  if(!placed)
    ar[0] = num
    print_array(ar)
  end
end

count = gets.to_i
ar = gets.strip.split.map {|i| i.to_i}

insertionSort(ar)