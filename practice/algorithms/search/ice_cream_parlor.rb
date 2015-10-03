tests = gets.chomp.to_i
tests.times do
  m = gets.chomp.to_i
  n = gets.chomp.to_i
  flavors = gets.chomp.split.map { |e| e.to_i }
  for i in 0...flavors.length - 1 do
    for j in i + 1...flavors.length do
      puts "#{i + 1} #{j + 1}" if flavors[i] + flavors[j] == m
    end
  end
end