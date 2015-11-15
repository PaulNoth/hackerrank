tests = gets.chomp.to_i
tests.times do
  input = gets.chomp.to_s
  if input =~ /\b(((2[0-5][0-5])|(1[0-9][0-9])|(\b[1-9][0-9]\b)|(\b\d\b))\.){3}((2[0-5][0-5])|(1[0-9][0-9])|(\b[1-9][0-9]\b)|(\b\d\b))\b/
    puts "IPv4" 
  elsif input =~ /([a-f0-9]{1,4}:){7}\b[0-9a-f]{1,4}\b/
    puts "IPv6"
  else
    puts "Neither"
  end
end