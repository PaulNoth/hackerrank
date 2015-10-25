t = gets.to_i
t.times do
  num = gets.chomp.to_s
  result = 0
  num.split("").each do |c|
    c_num = c.to_i
    result +=1 if c_num > 0 && num.to_i % c_num == 0
  end
  puts result
end