def maxXor(l, r)
  max = 0
  for i in l..r do
    for j in l..r do
      xor = i ^ j
      max = xor if xor > max
    end
  end
  return max
end


l = gets.to_i
r = gets.to_i
print maxXor(l, r)