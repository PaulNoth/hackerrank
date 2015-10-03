tests = gets.chomp.to_i
tests.times do
  (country_code, local_area, number) = gets.chomp.split(/ |\-/)
  puts "CountryCode=#{country_code},LocalAreaCode=#{local_area},Number=#{number}"
end