gets.chomp.to_i.times do
  input = gets.chomp.to_s
  if input =~ /^hackerrank$/ || input =~ /^hackerrank.*hackerrank$/ 
    puts "0"
  elsif input =~ /^hackerrank.*/
    puts "1"
  elsif input =~ /.*hackerrank$/
    puts "2"
  else
    puts "-1"
  end
end