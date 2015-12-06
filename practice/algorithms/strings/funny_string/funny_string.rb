def funny?(s)
  for i in 0...s.length() - 1
    return false if((s[i].ord - s[i + 1].ord).abs != (s[s.length() - i - 2].ord - s[s.length() - i - 1].ord).abs)
  end
  return true
end

tests = gets.to_i
tests.times do
  s = gets.to_s.strip
  if funny?(s)
    puts "Funny"
  else
    puts "Not Funny"
  end
end