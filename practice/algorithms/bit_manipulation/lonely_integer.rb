length = gets.chomp.to_i
array = gets.chomp.split.map { |e| e.to_i }
hash = Hash.new
array.each do |i|
  if hash[i].nil?
    hash[i] = 1
  else
    hash[i] += 1
  end
end

array.each { |a| puts a if hash[a] == 1}
