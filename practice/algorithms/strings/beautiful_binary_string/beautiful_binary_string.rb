l = gets.to_i
s = gets.to_s.strip

s.gsub!(/010/, "b")
s.gsub!(/[01]/, "")
puts s.length()