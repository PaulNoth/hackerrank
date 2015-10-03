a_length = gets.chomp.to_i
a = gets.chomp.split.map { |e| e.to_i }
b_length = gets.chomp.to_i
b = gets.chomp.split.map { |e| e.to_i }
a_hash = Hash.new(0)
b_hash = Hash.new(0)
a.each { |e| a_hash[e] += 1}
b.each { |e| b_hash[e] += 1}

result = []
b_hash.each_key do |key|
  b_value = b_hash[key]
  a_value = a_hash[key]
  result << key if a_value.nil? || b_value > a_value
end

result.sort! { |i, j| i <=> j }
puts result.join(" ")
