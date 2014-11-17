# Game of Thrones I
#
# King Robert has 7 kingdoms under his rule. He gets to know from Raven that the Dothraki 
# are going to wage a war against him soon. But, he knows the Dothraki need to cross the
# narrow river to enter his dynasty. There is only one bridge that connects both sides 
# of the river which is sealed by a huge door.
# 
# The king wants to lock the door, so that, the Dothraki can't enter. 
# But, to lock the door he needs a key that is an anagram of a certain palindrome string.
# 
# The king has a list of words. Help him figure out if any anagram of the words can be a palindrome or not?
# 
# Input Format 
# A single line which contains the input string
# 
# Constraints 
# 1<=length of string <= 10^5 
# Each character of the string is a lowercase english alphabet.
# 
# Output Format 
# A single line which contains YES/NO in capital letter of english alphabet.
# 
# Sample Input : 01
# aaabbbb
# 
# Sample Output : 01
# YES
# 
# Explanation 
# A palindrome permutation of the given string is bbaaabb. 
# 
# Sample Input : 02
# cdefghmnopqrstuvw
# 
# Sample Output : 02
# NO
# 
# Explanation 
# You can verify that the given string has no palindrome permutation. 

# palindrom je vtedy:
# - ak je dlzka parna, potom kazdy znak moze byt len parny pocet krat
# - ak je dlzka neparna, potom moze mat len jeden taky znak, ktoreho pocet je neparny
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