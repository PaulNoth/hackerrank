l = gets.to_i
text = gets.to_s
shift = gets.to_i

text.each_codepoint do |c|
  if(c >= 'a'.ord && c <= 'z'.ord)
    print ((c - 'a'.ord + shift) % 26 + 'a'.ord).chr
  elsif (c >= 'A'.ord && c <= 'Z'.ord)
    print ((c - 'A'.ord + shift) % 26 + 'A'.ord).chr
  else
    print c.chr
  end
end