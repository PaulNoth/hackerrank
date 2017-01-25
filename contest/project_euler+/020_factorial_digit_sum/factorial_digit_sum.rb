def factorial(n)
  fact = 1
  for i in 2..n do
    fact *= i
  end
  return fact
end


def sum_digits(number)
  chars = number.to_s.chars
  sum = 0
  chars.each { |char| sum += char.to_i }
  return sum
end
 
gets.chomp.to_i.times do
  n = gets.chomp.to_i
  puts sum_digits(factorial(n))
end
