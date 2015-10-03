# SOLUTION
# - usporiadam pole zostupne
# - pre kaz. prvok pola spravim N - prvok => rozdiel mi vravi o tom, ze tolko je ciastkovych moznosti ako vybrat ten prvok
#   hladam taky pocet prvkov, ktorych hodnota je mensia, ako aktualny index pola. len indem odkonca, nie od zaciatku.
#   (napr. ak by som mal 3-prvkove pole 2,0,1, tak najprv by som dostal 3-2 = 1, postupne by bolo 1*1*1, cize existuje len jedna kombinacia, ako vybrat karty)
# - rozdiel vynasobim s priebeznym vysledkom
#

test_cases = gets.chomp.to_i
test_cases.times do
  array_length = gets.chomp.to_i
  array  = gets.chomp.split.map { |e| e.to_i }
  
  array.sort! { |i,j| j <=> i }
  
  result = 1
  array.each do |element|
    diff = array_length - element
    diff = 0 if diff < 0
    result *= diff
    result %= 1000000007
    array_length -= 1
  end
  puts result
end
