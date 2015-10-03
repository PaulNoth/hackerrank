require "set"

lines = gets.chomp.to_i
tags = SortedSet.new
lines.times do
  line = gets.chomp.downcase
  line.scan(/<\s*[a-z0-9]+/) do |tag|
     tags << tag.gsub(/</, "")
   end
end

tags_arr = tags.to_a
for i in 0...tags_arr.length - 1 do
  print "#{tags_arr[i]};"
end
print "#{tags_arr[tags_arr.length - 1]}"
