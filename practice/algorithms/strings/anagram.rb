# - rozdelim na 2 polky
# - skumam po znakoch z prvej polky, ci sa nenachadza v druhej polke
# - ak ano, vymazem ten znak z druhej polky
# => tieto znaky netreba vymienat, tie tam su
# - zvysok, co zostane v druhej casti je vysledok, lebo tolko znakov potrebujem vymenit,
# aby bol anagram
def substitutions(input)
  half1 = input.slice(0, input.length / 2)
  half2 = input.slice(input.length / 2, input.length)
  
  for i in 0..half1.length - 1 do
    half2.sub!(half1[i], "") if half2.include?(half1[i])
  end
  return half2.length
end

tests = gets.chomp.to_i
tests.times do
  input = gets.chomp
  result = 0
  if input.length % 2 != 0
    result = -1
  else
    result = substitutions(input)
  end
  
  puts result
end