n = gets.to_i
n.times do
  name = gets.to_s.strip
  if /[_\.]\d+[a-zA-Z]*_?/ =~ name
    puts "VALID"
  else
    puts "INVALID"
  end
end