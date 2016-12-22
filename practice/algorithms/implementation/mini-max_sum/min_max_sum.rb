nums = gets.strip.split(" ").map(&:to_i)
nums.sort! {|a, b| a <=> b}


min_sum = 0
max_sum = 0
for i in (0...(nums.length - 1)) do
  min_sum += nums[i]
  max_sum += nums[i + 1]
end


puts "" + min_sum.to_s + " " + max_sum.to_s