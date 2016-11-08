n = gets.to_i
socks = gets.split(" ")
sock_groups = Hash.new
socks.each do |s|
  if !sock_groups.include?(s)
    sock_groups[s] = 1
  else
    count = sock_groups[s]
    sock_groups[s] = count + 1
  end
end

pairs = 0
sock_groups.values.each { |v| pairs += v / 2}

puts pairs