s = gets.strip
acc = ""
for i in 0...(s.length) do
  c = s[i]
  if(acc.length > 0 && acc[acc.length - 1] == c)
    acc = acc.slice(0, acc.length - 1)
  else
    acc = acc + c
  end
end

if(acc.length == 0)
  puts "Empty String"
else
  puts acc
end