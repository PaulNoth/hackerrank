class Point
  attr_reader :x, :y
  
  def initialize(x, y)
    @x = x
    @y = y
  end

  def self.symetric_point(point, midpoint)
    x = 2 * midpoint.x - point.x
    y = 2 * midpoint.y - point.y
    return Point.new(x, y)
  end
end


tests = gets.chomp.to_i
tests.times do
  coordinates = gets.chomp.split.map { |e| e.to_i }
  half1 = coordinates.slice(0..1)
  half2 = coordinates.slice(2..3)
  point = Point.new(half1[0], half1[1])
  midpoint = Point.new(half2[0], half2[1])
  
  symetric_point = Point.symetric_point(point, midpoint)
  puts "#{symetric_point.x} #{symetric_point.y}"
end