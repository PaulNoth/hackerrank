tests = gets.to_i
tests.times do
  (lower, upper) = gets.split(" ").map {|i| i.to_i}
  square_numbers = 0
  if(lower == upper)
    if (Math.sqrt(lower) == (Math.sqrt(lower)).ceil)
      puts 1
    else
      puts 0
    end
  else
    puts ((Math.sqrt(upper)).floor - (Math.sqrt(lower)).ceil + 1).to_i
  end
end
