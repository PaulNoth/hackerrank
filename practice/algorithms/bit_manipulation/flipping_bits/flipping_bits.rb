tests = gets.to_i
tests.times do
    puts 0xffffffff ^ gets.to_i
end