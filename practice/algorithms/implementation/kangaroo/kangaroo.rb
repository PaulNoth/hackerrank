def same_location(x1, v1, x2, v2)
  return "NO" if(v1 < v2)
  if(x1 < x2 && v1 > v2)
    xDiff = (x1 - x2).abs
    vDiff = (v1 - v2).abs
    if(xDiff % vDiff == 0)
      return "YES"
    else
      return "NO"
    end
  end
  "NO"
end

(x1, v1, x2, v2) = gets.strip.split(" ").map {|i| i.to_i}
puts same_location(x1, v1, x2, v2)