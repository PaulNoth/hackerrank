require "set"

tests = gets.to_i
tests.times do
  n = gets.to_i
  a = gets.to_i
  b = gets.to_i
  set = SortedSet.new([0])
  (n - 1).times do
    new_set = SortedSet.new
    set.each do |element|
      new_set << element + a
      new_set << element + b
    end
    set = new_set
  end
  puts set.to_a.join(" ")
end