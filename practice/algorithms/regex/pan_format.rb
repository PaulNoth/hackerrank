tests = gets.chomp.to_i
tests.times do
  input = gets.chomp.to_s
  if input =~ /[A-Z]{5}\d{4}[A-Z]/
    puts "YES"
  else
    puts "NO"
  end
end