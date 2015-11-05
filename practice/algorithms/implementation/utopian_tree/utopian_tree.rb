def tree(actualCycle, cycles, height)
  return height if(actualCycle == cycles)
  return tree(actualCycle + 1, cycles, height * 2) if(actualCycle % 2 == 0)
  tree(actualCycle + 1, cycles, height + 1)
end

tests = gets.to_i
tests.times do
  cycles = gets.to_i
  puts tree(0, cycles, 1)
end