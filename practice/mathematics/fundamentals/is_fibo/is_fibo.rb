def is_fibo(number)
  fib0 = 0
  fib1 = 1
  while fib0 <= number do
    return "IsFibo" if fib0 == number
    temp = fib0
    fib0 = fib1
    fib1 += temp
  end
  return "IsNotFibo"  
end

test_cases = gets.chomp.to_i
test_cases.times do
  number = gets.chomp.to_i
  result = is_fibo(number)
  puts result
end