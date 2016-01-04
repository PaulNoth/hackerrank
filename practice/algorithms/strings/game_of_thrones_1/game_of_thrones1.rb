def can_be_palindrome(input)
  char_hash = Hash.new(0)
  input.each_char { |c| char_hash[c] += 1 }
  
  if input.length.even?
    char_hash.each_key { |key| return 0 if char_hash[key].odd? }
  else
    has_odd = false
    char_hash.each_key do |key| 
      return 0 if has_odd && char_hash[key].odd?
      has_odd = true if char_hash[key].odd?
    end
  end
  return 1
end

string = gets.chomp 

found = can_be_palindrome(string)

if found == 1
    puts "YES"
else
    puts "NO"
end