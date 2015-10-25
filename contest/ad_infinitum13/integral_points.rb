def vectorLength(x1, y1, x2, y2)
  ((x2 - x1).power(2) + (y2 - y1).power(2)).sqrt(2)
end

def gcd(x, y)
  return x if(y == 0)
  return gcd(y, x % y)
end
   
def outer(x1, y1, x2, y2)
  return [gcd((x2 - x1).abs, (y2 - y1).abs) - 1, 0].max
end

tests = gets.to_i
tests.times do |i|
  arr = gets.split(' ').map {|s| s.to_i }
  x1 = arr[0]
  y1 = arr[1]
  x2 = arr[2]
  y2 = arr[3]
  x3 = arr[4]
  y3 = arr[5]
  
  outerPoints = outer(x1, y1, x2, y2);
  outerPoints += outer(x1, y1, x3, y3);
  outerPoints += outer(x2, y2, x3, y3);
  outerPoints += 3;
  
  area = ((x1 - x3) * (y2 - y1) - (x1 - x2) * (y3 - y1)).abs;
  interiorPoints = [((area - outerPoints + 2) / 2), 0].max;
  
  puts interiorPoints
end