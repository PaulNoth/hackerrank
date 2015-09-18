def fibonacci(n)
  fi = (1 + Math.sqrt(5)) / 2
  psi = 1 - fi
  return ((fi**n - psi**n) / Math.sqrt(5)).to_i
end

def sum_of_even_fibonacci(number)
  index = 3                   # at index % 3 == 0 there are always even fibonacci numbers
  result = 0
  num = fibonacci(index)
  while num <= number
    result += num
    index += 3
    num = fibonacci(index)
  end
  return result
end

def sum_of_even_fibonacci_naive(number)
  result = 0
  a = 0
  b = 1
  while b < number
    temp = a + b
    a = b
    b = temp
    result += a if a % 2 == 0
  end
  return result
end

gets.chomp.to_i.times do
  input = gets.chomp.to_i
  puts sum_of_even_fibonacci_naive(input)
end
