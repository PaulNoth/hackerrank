require 'set'

s = Set.new(gets.downcase.gsub(/\s+/, "").chars())
if(s.size() == 26)
  puts "pangram"
else
  puts "not pangram"
end