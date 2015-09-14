n = gets.to_i;

def factorial(n)
  if n <= 1
    return 1
  end
  return n * factorial(n - 1)
end

puts factorial(n)