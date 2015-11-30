def deletions(s)
  last = s[0]
  dels = 0
  for i in 1..(s.length) do
    if last == s[i]
      dels += 1
    else
      last = s[i]
    end
  end
  dels
end

var tests = gets.to_i
tests.times do
  s = gets
  puts deletions(s)
end