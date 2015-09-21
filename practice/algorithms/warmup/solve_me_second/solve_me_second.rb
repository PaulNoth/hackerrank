def solveMeSecond (a, b)
    return a+b
end
t = gets.to_i
(0...t).each do |i|
    lis = gets.strip.split(" ")
    a = lis[0].to_i
    b = lis[1].to_i
    res = solveMeSecond(a,b)
    puts res
end
